public class RotateArray {
    public int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] res = new int[nums.length];

        for (int i = 0, j = nums.length - k; i < nums.length && j < nums.length + (nums.length - k); i++, j++) {
            res[j] = nums[j % nums.length];
        }
        return res;
    }

    public static void main(String[] args) {
        RotateArray solution = new RotateArray();
        int[] res1 = solution.rotate(new int[] {1,2,3,4,5,6,7}, 3); //[5,6,7,1,2,3,4]
        int[] res2 = solution.rotate(new int[] {-1,-100,3,99}, 2); //[5,6,7,1,2,3,4]
        System.out.println("Result: ");
        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i] + " ");
        }
        System.out.println(", ");
        for (int i = 0; i < res2.length; i++) {
            System.out.print(res2[i] + " ");
        }
        System.out.println("");
    }
}
