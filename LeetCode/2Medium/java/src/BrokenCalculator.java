public class BrokenCalculator {
    public int brokenCalc(int startValue, int target) {
        //TODO: Fix me. Current logic is incorrect.
        int calculations = 0;
        while (startValue != target) {
            int doubleValue = startValue * 2;
            int decrementValue = startValue - 1;
            if (Math.abs(target - doubleValue) < Math.abs(target - decrementValue) &&
                    Math.abs(target - doubleValue) < Math.abs(target - decrementValue*2))
                startValue = doubleValue;
            else startValue = decrementValue;
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
