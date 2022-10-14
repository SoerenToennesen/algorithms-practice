public class OptimalDivision {
    public String optimalDivision(int[] nums) {
        // TODO: Implement me

        return "";
    }

    public static void main(String[] args) {
        OptimalDivision solution = new OptimalDivision();
        String res1 = solution.optimalDivision(new int[] {1000, 100, 10, 2}); // "1000/(100/10/2)"
        String res2 = solution.optimalDivision(new int[] {2,3,4}); // "2/(3/4)"
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
