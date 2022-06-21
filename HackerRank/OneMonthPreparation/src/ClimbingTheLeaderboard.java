import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultClimbingTheLeaderboard {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    private static int binarySearchForIndex(List<Integer> ranked, int low, int high, int target) {
        int mid = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (ranked.get(mid) > target) {
                high = mid - 1;
            } else if (ranked.get(mid) < target) {
                low = mid + 1;
            } else {
                while (mid > 0) {
                    if (ranked.get(mid - 1) == target) mid--;
                    else return mid + 1; // + 1 because we convert from index to placement, which is 1-indexed
                }
            }
        }
        return mid + 1;
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        int scoreTemp = 0;
        int low = 0; int high = ranked.size() - 1;
        for (int i = 0; i < player.size(); i++) {
            scoreTemp += player.get(i);
            int index = binarySearchForIndex(ranked, low, high, scoreTemp);
            res.add(index);
        }
        return res;
    }

}

public class ClimbingTheLeaderboard {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = ResultClimbingTheLeaderboard.climbingLeaderboard(ranked, player);

        /*bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );*/

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
