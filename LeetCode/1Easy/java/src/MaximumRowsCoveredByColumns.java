public class MaximumRowsCoveredByColumns {
    public int maximumRows(int[][] matrix, int numSelect) {

        return -1;
    }

    public static void main(String[] args) {
        MaximumRowsCoveredByColumns solution = new MaximumRowsCoveredByColumns();
        int res1 = solution.maximumRows(new int[][]{{0,0,0},{1,0,1},{0,1,1},{0,0,1}}, 2);
        int res2 = solution.maximumRows(new int[][]{{1},{0}}, 1);
        System.out.println("Results: " + res1 + ", " + res2);
    }
}
