import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultWaiter {

    /*
     * Complete the 'waiter' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY number
     *  2. INTEGER q
     */

    private static List<Integer> relevantPrimes(int n) {
        int x, y, flg;
        List<Integer> primes = new ArrayList<>();
        for (x = 1; x <= n; x++) {
            if (x == 1 || x == 0) continue;
            flg = 1;
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1) primes.add(x);
        }
        return primes;
    }

    public static List<Integer> waiter(List<Integer> number, int q) {
        // Write your code here
        List<Integer> primes = relevantPrimes(Collections.max(number));
        List<Integer> answers = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int j = 0;
            while (j < number.size()) {
                if (primes.contains(number.get(j))) {
                    answers.add(number.get(j));
                    number.remove(j);
                }
                j++;
            }
        }
        for (int i = number.size() - 1; i >= 0; i--) {
            answers.add(0, number.get(i));
        }
        return answers;
    }

}

public class Waiter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> number = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = ResultWaiter.waiter(number, q);

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
