
// 1518. Water Bottles

class WaterBottles {
    public int solution(int numBottles, int numExchange) {
        int res = numBottles;
        while (numBottles >= numExchange) {
            numBottles /= numExchange;
            res += numBottles;
        }
        return res;
    }

    public static void main(String[] args) {
        WaterBottles waterBottles = new WaterBottles();
        System.out.println(waterBottles.solution(9, 3));
    }
}

