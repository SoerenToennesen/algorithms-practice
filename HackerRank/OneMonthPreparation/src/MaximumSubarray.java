import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultMaximumSubarray {

    /*
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> maxSubarray(List<Integer> arr) {
        // Write your code here
        int[] maximum = {0, 0};
        int maxSum = 0;
        int[] current = {0, 0};
        int currentSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            currentSum += arr.get(i);
            current[1] = i;
            if (currentSum < 0) {
                if (currentSum - arr.get(i) > maxSum) {
                    maxSum = currentSum;
                    maximum[0] = current[0];
                    maximum[1] = current[1] - 1;
                }
                currentSum = 0;
                current[0] = i + 1;
            }
        }

        return arr;
    }

}

public class MaximumSubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                List<Integer> result = ResultMaximumSubarray.maxSubarray(arr);

//                bufferedWriter.write(
//                        result.stream()
//                                .map(Object::toString)
//                                .collect(joining(" "))
//                                + "\n"
//                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
