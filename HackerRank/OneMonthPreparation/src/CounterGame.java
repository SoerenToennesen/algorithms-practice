import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class ResultCounterGame {

    /*
     * Complete the 'counterGame' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static String counterGame(long n) {
        // Write your code here
        String currentWinner = "Richard";
        while (n > 1) {
            currentWinner = currentWinner == "Louise" ? "Richard" : "Louise";
            if ((n & (n - 1)) == 0) {
                n /= 2;
            } else {
                n -= (long) Math.pow(2, Long.SIZE - Long.numberOfLeadingZeros(n) - 1);
            }
        }
        return currentWinner;
    }

}

public class CounterGame {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                String result = ResultCounterGame.counterGame(n);

                //bufferedWriter.write(result);
                //bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
