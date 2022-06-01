import java.io.*;
import java.util.stream.*;

import static java.lang.Long.parseLong;
import static java.util.stream.Collectors.joining;

class ResultFlippingBits {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
        // Write your code here
        String binRepresentation = Integer.toBinaryString((int) n);
        binRepresentation = String.format("%32s", Integer.toBinaryString((int) n)).replace(' ', '0');
        String tempResult = "";
        for (char c : binRepresentation.toCharArray()) {
            if (c == '0') tempResult += '1';
            else tempResult += '0';
        }
        return parseLong(tempResult, 2);
    }

}

public class FlippingBits {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long n = parseLong(bufferedReader.readLine().trim());

                long result = ResultFlippingBits.flippingBits(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
