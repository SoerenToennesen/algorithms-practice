import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultCastleOnTheGrid {

    /*
     * Complete the 'minimumMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY grid
     *  2. INTEGER startX
     *  3. INTEGER startY
     *  4. INTEGER goalX
     *  5. INTEGER goalY
     */
    private int bfs(List<String> grid, int posX, int posY, int goalX, int goalY, int moves, int direction) {
        //TODO: Need to keep track of visited, to not backtrack, and make sure when we return, we have to try all other moves, and not return it as the final value. Perhaps keep a queue to do this (if queue is not empty, go test next in queue).
        if (posX == goalX && posY == goalY) {
            return moves;
        }
        for (int i = 0; i < 4; i++) {
            return bfs(grid, i % 2 == 0 ? posX + 1 : posX, i % 2 != 0 ? posY + 1 : posY, goalX, goalY, i == direction ? moves : moves + 1, i);
        }
        return -1;
    }

    public static int minimumMoves(List<String> grid, int startX, int startY, int goalX, int goalY) {
        // Write your code here
        // TODO: Idea is to make a BFS, where everytime we change direction than the previous, we increase our count.
        int moves = 0;

        return -1;
    }

}

public class CastleOnTheGrid {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int startX = Integer.parseInt(firstMultipleInput[0]);

        int startY = Integer.parseInt(firstMultipleInput[1]);

        int goalX = Integer.parseInt(firstMultipleInput[2]);

        int goalY = Integer.parseInt(firstMultipleInput[3]);

        int result = ResultCastleOnTheGrid.minimumMoves(grid, startX, startY, goalX, goalY);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
