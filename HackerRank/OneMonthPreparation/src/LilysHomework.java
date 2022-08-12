import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultLilysHomework {

    /*
     * Complete the 'lilysHomework' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int lilysHomework(List<Integer> arr) {
        // Write your code here
        int res = 0;
        int i = 0;
        List<Integer> sortedArr = arr.stream().sorted().collect(toList());
        while (!arr.equals(sortedArr)) {
            if (!Objects.equals(sortedArr.get(i), arr.get(i))) {
                int toSwitch = arr.indexOf(sortedArr.get(i));
                arr.set(toSwitch, arr.get(i));
                arr.set(i, sortedArr.get(i));
                res++;
            }
            i++;
        }
        return res;
    }

}

public class LilysHomework {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = ResultLilysHomework.lilysHomework(arr);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
