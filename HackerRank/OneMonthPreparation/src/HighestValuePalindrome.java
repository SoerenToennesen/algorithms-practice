import java.io.*;

import static java.util.stream.Collectors.joining;

class ResultHighestValuePalindrome {

    /*
     * Complete the 'highestValuePalindrome' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER n
     *  3. INTEGER k
     */

    public static String highestValuePalindrome(String s, int n, int k) {
        // Write your code here
        char[] charArray = s.toCharArray();

        // 1. Convert to palindrome
        for (int i = 0; i < n/2; i++) {
            if (charArray[i] == charArray[n-1-i]) continue;
            boolean isLower = charArray[i] > charArray[n-1-i];
            if (isLower) {
                charArray[n-1-i] = charArray[i];
            } else {
                charArray[i] = charArray[n-1-i];
            }
            k--;
            if (k < 0) return "-1";
        }

        // 2. Make highest possible palindrome
        if (n % 2 == 1) {
            charArray[n / 2] = '9';
            k--;
        }
        int i = 0; int j = n - 1;
        while (k > 0) {
            if (i >= j) break;
            if (charArray[i] != '9') {
                charArray[i] = '9';
                charArray[j] = '9';
                k -= 2;
            }
            i++;
            j--;
        }

        String res = "";
        for (char c : charArray) {
            res += c;
        }
        return res;
    }

}

public class HighestValuePalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String s = bufferedReader.readLine();

        String result = ResultHighestValuePalindrome.highestValuePalindrome(s, n, k);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
