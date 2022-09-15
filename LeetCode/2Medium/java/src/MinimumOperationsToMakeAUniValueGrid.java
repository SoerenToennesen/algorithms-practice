import java.util.ArrayList;
import java.util.List;

public class MinimumOperationsToMakeAUniValueGrid {
    public int minOperations(int[][] grid, int x) {
        List<Integer> storedValues = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                storedValues.add(grid[i][j]);
            }
        }
        int median = storedValues.get(storedValues.size() / 2);
        int operations = 0;
        for (int i = 0; i < storedValues.size(); i++) {
            int tempValue = storedValues.get(i);
            boolean increasing = true;
            if (tempValue > median) increasing = false;
            while (tempValue != median) {
                if (tempValue > median && increasing || tempValue < median && !increasing) return -1;
                tempValue += increasing ? x : -x;
                operations++;
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        MinimumOperationsToMakeAUniValueGrid solution = new MinimumOperationsToMakeAUniValueGrid();
        int res1 = solution.minOperations(new int[][] {{2,4},{6,8}}, 2);
        int res2 = solution.minOperations(new int[][] {{1,5},{2,3}}, 1);
        int res3 = solution.minOperations(new int[][] {{1,2},{3,4}}, 3);
        System.out.println("Result: " + res1 + ", " + res2 + ", " + res3);
    }
}
