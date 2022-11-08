import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalTraverseII {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<Integer> tempRes = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j == 0; j--) {
                tempRes.add(nums.get(j).get(i));
            }
        }
        return tempRes.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        DiagonalTraverseII solution = new DiagonalTraverseII();
        int[] res1 = solution.findDiagonalOrder(Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(7,8,9)));
        int[] res2 = solution.findDiagonalOrder(Arrays.asList(Arrays.asList(1,2,3,4,5),Arrays.asList(6,7),Arrays.asList(8),Arrays.asList(9,10,11)));
        System.out.println("Results: ");
        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < res2.length; i++) {
            System.out.print(res2[i] + " ");
        }
    }
}
