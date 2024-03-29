import java.util.*;

public class ReplaceElementsInAnArray {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }
        for (int i = 0; i < operations.length; i++) {
            int index = numsMap.get(operations[i][0]);
            nums[index] = operations[i][1];
            numsMap.put(operations[i][1], index);
        }
        return nums;
    }

    public static void main(String[] args) {
        ReplaceElementsInAnArray solution = new ReplaceElementsInAnArray();
        int[] res1 = solution.arrayChange(new int[] {1,2,4,6}, new int[][] {{1,3},{4,7},{6,1}}); //[3,2,7,1]
        int[] res2 = solution.arrayChange(new int[] {1,2}, new int[][] {{1,3},{2,1},{3,2}}); //[2,1]
        System.out.println("Result: ");
        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i] + ",");
        }
        System.out.println(" ");
        for (int i = 0; i < res2.length; i++) {
            System.out.print(res2[i] + ",");
        }
    }
}
