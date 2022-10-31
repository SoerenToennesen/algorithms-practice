public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        return -1;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int res1 = solution.maxProfit(new int[] {7,1,5,3,6,4}); //5
        int res2 = solution.maxProfit(new int[] {7,6,4,3,1}); //0
        System.out.println("Results: " + res1 + ", " + res2);
    }

}
