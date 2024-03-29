import java.util.*;

public class DistantBarcodes {

    public int[] rearrangeBarcodes(int[] barcodes) {
        if (barcodes.length == 0) return new int[] {};
        int temp = barcodes[0];
        for (int i = 1; i < barcodes.length; i++) {
            if (barcodes[i] == temp) {
                int j = i + 1;
                while (j < barcodes.length) {
                    if (barcodes[j] != temp) {
                        int swap = barcodes[j];
                        barcodes[j] = barcodes[i];
                        barcodes[i] = swap;
                        temp = swap;
                        break;
                    }
                    j++;
                }
            } else {
                temp = barcodes[i];
            }
        }
        return barcodes;
    }

    public static void main(String[] args) {
        DistantBarcodes solution = new DistantBarcodes();
        int[] res1 = solution.rearrangeBarcodes(new int[] {1,1,1,2,2,2}); //[2,1,2,1,2,1]
        int[] res2 = solution.rearrangeBarcodes(new int[] {1,1,1,1,2,2,3,3}); //[1,3,1,3,1,2,1,2]
        //System.out.println("Result: " + res1 + ", " + res2);
        System.out.print("Result1: ");
        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i] + ",");
        }
        System.out.println("");
        System.out.print("Result2: ");
        for (int i = 0; i < res2.length; i++) {
            System.out.print(res2[i] + ",");
        }
        System.out.println("");
    }
}
