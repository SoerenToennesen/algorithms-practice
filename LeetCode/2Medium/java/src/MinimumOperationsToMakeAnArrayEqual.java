public class MinimumOperationsToMakeAnArrayEqual {
    public int minOperations(int n) {
        return (((n-1)/2 + 1) * n) / 2 - (n % 2 != 0 ? 1 : 0);
    }

    public static void main(String[] args) {
        MinimumOperationsToMakeAnArrayEqual solution = new MinimumOperationsToMakeAnArrayEqual();
        int res1 = solution.minOperations(3); //2
        int res2 = solution.minOperations(6); //9
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
