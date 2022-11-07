import java.util.Arrays;

public class MaximumRowsCoveredByColumns {
    private boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
    public int maximumRows(int[][] matrix, int numSelect) {
        int[][] sumCol = new int[matrix.length][2]; // We want to keep track of the index of the column when we sort by max
        for (int i = 0; i < matrix.length; i++) {
            sumCol[i][1] = i;
            for (int j = 0; j < matrix[0].length; j++) {
                sumCol[i][0] += matrix[i][j];
            }
        }
        Arrays.sort(sumCol, (a, b) -> b[0] - a[0]);
        int[] selectedColumns = new int[numSelect];
        for (int i = 0; i < numSelect; i++) {
            selectedColumns[i] = sumCol[i][1];
        }

        // Run through matrix and see how many rows we can count up
        int res = 0;
        for (int i = 0; i < matrix.length; i++) {
            boolean add = true;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1 && !contains(selectedColumns, i)) {
                    add = false;
                    break;
                }
            }
            if (add) res++;
        }

        return res;
    }

    public static void main(String[] args) {
        MaximumRowsCoveredByColumns solution = new MaximumRowsCoveredByColumns();
        int res1 = solution.maximumRows(new int[][]{{0,0,0},{1,0,1},{0,1,1},{0,0,1}}, 2);
        int res2 = solution.maximumRows(new int[][]{{1},{0}}, 1);
        System.out.println("Results: " + res1 + ", " + res2);
    }
}
