import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    private Map<Integer, Integer> memo = new HashMap<>();
    public int climbStairs(int n) {
        int res = 0;
        if (memo.containsKey(n)) return memo.get(n);
        if (n == 1) return 1;
        if (n == 2) return 2;
        res = climbStairs(n-1) + climbStairs(n-2);
        memo.put(n, res);
        return res;
    }

    public static void main(String[] args) {
        ClimbingStairs solution = new ClimbingStairs();
        int res1 = solution.climbStairs(2); //2
        int res2 = solution.climbStairs(3); //3
        System.out.println("Results: " + res1 + ", " + res2);
    }
}
