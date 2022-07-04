import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultEqualStacks {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        Collections.reverse(h1);
        Collections.reverse(h2);
        Collections.reverse(h3);
        int sum = 0;
        for (int i = 0; i < h1.size(); i++) {
            sum += h1.get(i);
            h1.set(i, sum);
        }
        for (int i = 0; i < h2.size(); i++) {
            sum += h2.get(i);
            h2.set(i, sum);
        }
        for (int i = 0; i < h3.size(); i++) {
            sum += h3.get(i);
            h3.set(i, sum);
        }
        Collections.reverse(h1);
        Collections.reverse(h2);
        Collections.reverse(h3);
        int smallestList = h1.size() < h2.size() ? h1.size() < h3.size() ? 1 : 3 : 2;
        switch (smallestList) {
            case 1:
                for (int i = 0; i < h1.size(); i++) {
                    if (h2.contains(h1.get(i)) && h3.contains(h1.get(i))) return h1.get(i);
                }
                break;
            case 2:
                for (int i = 0; i < h2.size(); i++) {
                    if (h1.contains(h2.get(i)) && h3.contains(h2.get(i))) return h2.get(i);
                }
                break;
            case 3:
                for (int i = 0; i < h1.size(); i++) {
                    if (h2.contains(h3.get(i)) && h1.contains(h3.get(i))) return h3.get(i);
                }
                break;
            default:
                break;
        }
        return -1;
    }

}

public class EqualStacks {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = ResultEqualStacks.equalStacks(h1, h2, h3);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
