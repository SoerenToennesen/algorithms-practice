import java.io.*;

import static java.util.stream.Collectors.joining;

class ResultTimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        boolean addHours = (s.charAt(s.length() - 2) == 'A' && (Integer.parseInt(s.substring(0,2)) == 12)) ||
                (s.charAt(s.length() - 2) != 'A' && !(Integer.parseInt(s.substring(0,2)) == 12));
        int hour = (Integer.parseInt(s.substring(0,2)) + (addHours ? 12 : 0)) % 24;
        return (hour < 10 ? "0" + hour : hour) + s.substring(2,s.length() - 2);
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = ResultTimeConversion.timeConversion(s);
        System.out.println(result);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
