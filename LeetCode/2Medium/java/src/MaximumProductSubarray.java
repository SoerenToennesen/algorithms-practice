public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {

        return -1;
    }

    public static void main(String[] args) {
        MaximumProductSubarray solution = new MaximumProductSubarray();
        int res1 = solution.maxProduct(new int[] {2,3,-2,4}); //4
        int res2 = solution.maxProduct(new int[] {-2,0,-1}); //0
        System.out.println("Results: " + res1 + ", " + res2);
    }
}
