public class BrokenCalculator {
    public int brokenCalc(int startValue, int target) {
        int calculations = 0;
        while (startValue != target) {
            if (target > startValue) {
                target /= 2;
            } else {
                target++;
            }
            calculations++;
        }
        return calculations;
    }
    public static void main(String[] args) {
        BrokenCalculator solution = new BrokenCalculator();
        int res1 = solution.brokenCalc(2,3); //2
        int res2 = solution.brokenCalc(5,8); //2
        int res3 = solution.brokenCalc(3,10); //3
        System.out.println("Result: " + res1 + ", " + res2 + ", " + res3);
    }
}
