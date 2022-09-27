public class DistantBarcodes {

    public int[] rearrangeBarcodes(int[] barcodes) {

        return new int[] {-1};
    }

    public static void main(String[] args) {
        DistantBarcodes solution = new DistantBarcodes();
        int[] res1 = solution.rearrangeBarcodes(new int[] {1,1,1,2,2,2}); //[2,1,2,1,2,1]
        int[] res2 = solution.rearrangeBarcodes(new int[] {1,1,1,1,2,2,3,3}); //[1,3,1,3,1,2,1,2]
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
