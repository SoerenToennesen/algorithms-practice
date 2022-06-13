import java.io.*;

import static java.util.stream.Collectors.joining;

class ResultRecursiveDigitSum {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        // Write your code here
        long tempResult = 0;
        for (char c : n.toCharArray()) {
            tempResult += c - '0';
        }
        tempResult *= k;
        String numString = String.valueOf(tempResult);
        tempResult = 0;
        while (numString.length() > 1) {
            for (char c : numString.toCharArray()) {
                tempResult += c - '0';
            }
            numString = String.valueOf(tempResult);
            tempResult = 0;
        }
        return Integer.parseInt(numString);
    }

}

public class RecursiveDigitSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = ResultRecursiveDigitSum.superDigit(n, k);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
