import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultHackerlandRadioTransmitters {

    /*
     * Complete the 'hackerlandRadioTransmitters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY x
     *  2. INTEGER k
     */

    public static int hackerlandRadioTransmitters(List<Integer> x, int k) {
        // Write your code here
        Collections.sort(x);
        int res = 0;
        int currAntenna = x.get(0);
        for (int i = 0; i < x.size(); i++) {
            if (currAntenna + k < x.get(i)) {
                currAntenna = x.get(i-1);
                for (int j = i; j < x.size(); j++) {
                    if (currAntenna + k < x.get(j)) {
                        i = j;
                        break;
                    }
                }
                res++;
                currAntenna = x.get(i);
            }
        }
        return res + 1;
    }

}

public class HackerlandRadioTransmitters {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> x = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = ResultHackerlandRadioTransmitters.hackerlandRadioTransmitters(x, k);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
