public class MinimizeMaximumPairSumInArray {
    public int minPairSum(int[] nums) {

        return -1;
    }

    public static void main(String[] args) {
        MinimizeMaximumPairSumInArray solution = new MinimizeMaximumPairSumInArray();
        int res1 = solution.minPairSum(new int[] {3,5,2,3}); //7
        int res2 = solution.minPairSum(new int[] {3,5,4,2,4,6}); //7
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
