import java.util.Arrays;

public class MinimizeMaximumPairSumInArray {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            int tempPairSum = nums[i] + nums[nums.length - 1 - i];
            if (tempPairSum > res) res = tempPairSum;
        }
        return res;
    }

    public static void main(String[] args) {
        MinimizeMaximumPairSumInArray solution = new MinimizeMaximumPairSumInArray();
        int res1 = solution.minPairSum(new int[] {3,5,2,3}); //7
        int res2 = solution.minPairSum(new int[] {3,5,4,2,4,6}); //7
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
