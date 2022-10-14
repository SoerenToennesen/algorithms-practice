public class OptimalDivision {
    public String optimalDivision(int[] nums) {
        // Answer gotten from https://leetcode.com/problems/optimal-division/solution/
        // 2 / 4 / 8 / 10
        // 6 / 8 / 2 / 10 / 6 / 4
        // Idea: you always want to respectively maximize and then minimize each next operation, starting with maximize
        if (nums.length == 1) return nums[0] + "";
        if (nums.length == 2) return nums[0] + "/" + nums[1];
        StringBuilder res = new StringBuilder(nums[0] + "/(" + nums[1]);
        for (int i = 2; i < nums.length; i++) {
            res.append("/" + nums[i]);
        }
        res.append(")");
        return res.toString();
    }

    public static void main(String[] args) {
        OptimalDivision solution = new OptimalDivision();
        String res1 = solution.optimalDivision(new int[] {1000, 100, 10, 2}); // "1000/(100/10/2)"
        String res2 = solution.optimalDivision(new int[] {2,3,4}); // "2/(3/4)"
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
