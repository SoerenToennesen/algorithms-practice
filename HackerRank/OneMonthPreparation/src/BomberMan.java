import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultBomberMan {

    /*
     * Complete the 'bomberMan' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING_ARRAY grid
     */

    public static List<String> bomberMan(int n, List<String> grid) {
        // Write your code here
        List<String> timer = new ArrayList<>(grid);
        for (int i = 0; i < grid.size(); i++) {
            int j = 0;
            for (char c : grid.get(i).toCharArray()) {
                if (c == 'O') {
                    timer.set(i, timer.get(i).substring(0, j) + "3" + timer.get(i).substring(j+1));
                } else {
                    timer.set(i, timer.get(i).substring(0, j) + "0" + timer.get(i).substring(j+1));
                }
                j++;
            }
        }
        for (int k = 1; k < n; k++) {
            for (int i = 0; i < grid.size(); i++) {
                for (int j = 0; j < grid.get(i).length(); j++) {
                    if (grid.get(i).charAt(j) == '.') {
                        grid.set(i, grid.get(i).substring(0, j) + "O" + grid.get(i).substring(j+1));
                        timer.set(i, timer.get(i).substring(0, j) + "3" + timer.get(i).substring(j+1));
                    } else { //TODO: Insert logic, which also clears neighbouring bombs.
                             // Also, if any bombs are planted, make sure to not do anything
                             // except decrement timer ("bomberman stands back and observes").
                        int nextTime = Integer.parseInt(String.valueOf(timer.get(i).charAt(j))) - 1;
                        timer.set(i, timer.get(i).substring(0, j) + nextTime + timer.get(i).substring(j+1));
                        if (nextTime == 0) {
                            grid.set(i, grid.get(i).substring(0, j) + "." + grid.get(i).substring(j+1));
                        }
                    }
                }
            }
        }
        return grid;
    }
}

public class BomberMan {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r = Integer.parseInt(firstMultipleInput[0]);

        int c = Integer.parseInt(firstMultipleInput[1]);

        int n = Integer.parseInt(firstMultipleInput[2]);

        List<String> grid = IntStream.range(0, r).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = ResultBomberMan.bomberMan(n, grid);

        //bufferedWriter.write(
        //        result.stream()
        //                .collect(joining("\n"))
        //                + "\n"
        //);

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
