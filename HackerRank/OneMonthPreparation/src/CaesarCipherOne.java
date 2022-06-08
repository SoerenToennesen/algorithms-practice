import java.io.*;

import static java.util.stream.Collectors.joining;

class ResultCaesarCipherOne {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here
        String res = "";
        for (char c : s.toCharArray()) {
            int ascii = (int) c;
            if (!((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122))) {
                res += c;
                continue;
            }
            if (Character.isLowerCase(c)) {
                ascii -= 97;
            } else {
                ascii -= 65;
            }
            ascii = (ascii + k) % 26;
            res += (char) (ascii + (Character.isLowerCase(c) ? 97 : 65));
        }
        return res;
    }

}

public class CaesarCipherOne {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = ResultCaesarCipherOne.caesarCipher(s, k);
        System.out.println(result);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
