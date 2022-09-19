public class MaximumAveragePassRatio {
    public double maxAverageRatio(int[][] classes, int extraStudents) {

        return -1;
    }

    public static void main(String[] args) {
        MaximumAveragePassRatio solution = new MaximumAveragePassRatio();
        double res1 = solution.maxAverageRatio(new int[][] {{1,2},{3,5},{2,2}}, 2);
        double res2 = solution.maxAverageRatio(new int[][] {{2,4},{3,9},{4,5},{2,10}}, 4);
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
