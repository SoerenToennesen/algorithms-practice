public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        int maximum = nums[0];
        int minimum = nums[0];
        int res = maximum;
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int temp_max = Math.max(current, Math.max(maximum * current, minimum * current));
            minimum = Math.min(current, Math.min(maximum * current, minimum * current));
            maximum = temp_max;
            res = Math.max(maximum, res);
        }
        return res;
    }

    public static void main(String[] args) {
        MaximumProductSubarray solution = new MaximumProductSubarray();
        int res1 = solution.maxProduct(new int[] {2,3,-2,4}); //4
        int res2 = solution.maxProduct(new int[] {-2,0,-1}); //0
        System.out.println("Results: " + res1 + ", " + res2);
    }
}
