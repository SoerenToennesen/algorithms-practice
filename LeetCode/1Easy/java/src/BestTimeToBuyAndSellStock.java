public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int[] profit = new int[prices.length];
        int minimum = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minimum) {
                minimum = prices[i];
            }
            profit[i] = Math.max(profit[i-1], prices[i] - minimum);
        }
        return profit[profit.length - 1];
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int res1 = solution.maxProfit(new int[] {7,1,5,3,6,4}); //5
        int res2 = solution.maxProfit(new int[] {7,6,4,3,1}); //0
        System.out.println("Results: " + res1 + ", " + res2);
    }

}
