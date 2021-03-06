import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultIceCreamParlor {

    /*
     * Complete the 'icecreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        List<int[]> sortedList = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            int[] tuple = {arr.get(i), i};
            sortedList.add(tuple);
        }
        Collections.sort(sortedList, Comparator.comparingInt(o -> o[0]));

        int pointer1 = 0;
        int pointer2 = arr.size() - 1;

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < sortedList.size(); i++) {
            if (pointer1 == pointer2) break;
            int tempSum = sortedList.get(pointer1)[0] + sortedList.get(pointer2)[0];
            if (tempSum == m) {
                res.add(sortedList.get(pointer1)[1] + 1);
                res.add(sortedList.get(pointer2)[1] + 1);
                break;
            }
            if (tempSum < m) pointer1++;
            else pointer2--;
        }

        return res;
    }

}

public class IceCreamParlor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int m = Integer.parseInt(bufferedReader.readLine().trim());

                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                List<Integer> result = ResultIceCreamParlor.icecreamParlor(m, arr);

                bufferedWriter.write(
                        result.stream()
                                .map(Object::toString)
                                .collect(joining(" "))
                                + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
