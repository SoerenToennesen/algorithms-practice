import java.io.*;

import static java.util.stream.Collectors.joining;

class ResultSherlockAndValidString {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
        // Write your code here
        return s;
    }

}

public class SherlockAndValidString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = ResultSherlockAndValidString.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
