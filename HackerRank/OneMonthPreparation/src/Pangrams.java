import java.io.*;

import static java.util.stream.Collectors.joining;

class ResultPangrams {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        int twentySixSetBits = 0;
        for (char c : s.toCharArray()) {
            int ascii = (int) c;
            boolean isLowerCase = Character.isLowerCase(c);
            int setBit = (int) Math.pow(2, (isLowerCase ? ascii - 97 : ascii - 65));
            twentySixSetBits |= setBit;
            if (twentySixSetBits == 67108863) return "pangram";
        }
        return "not pangram";
    }

}

public class Pangrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = ResultPangrams.pangrams(s);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
