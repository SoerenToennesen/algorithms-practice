import java.util.*;

public class DistantBarcodes {

    public int[] rearrangeBarcodes(int[] barcodes) {
        LinkedHashMap<Integer, Integer> typeCount = new LinkedHashMap();
        for (int i = 0; i < barcodes.length; i++) {
            typeCount.merge(barcodes[i], 1, Integer::sum);
        }
        int[][] insertList = new int[typeCount.size()][2];
        int i = 0;
        typeCount.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry -> {
            insertList[i][0] = entry.getKey();
            insertList[i][1] = entry.getValue();
            i++;
        });

        return new int[] {-1};
    }

    public static void main(String[] args) {
        DistantBarcodes solution = new DistantBarcodes();
        int[] res1 = solution.rearrangeBarcodes(new int[] {1,1,1,2,2,2}); //[2,1,2,1,2,1]
        int[] res2 = solution.rearrangeBarcodes(new int[] {1,1,1,1,2,2,3,3}); //[1,3,1,3,1,2,1,2]
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
