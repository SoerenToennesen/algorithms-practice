import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    private void backtrack(List<String> res, String currentString, int open, int close, int max) {
        if (currentString.length() == max * 2) {
            res.add(currentString);
            return;
        }
        if (open < max) backtrack(res, currentString + "(", open + 1, close, max);
        if (close < open) backtrack(res, currentString + ")", open, close + 1, max);
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    public static void main(String[] args) {
        GenerateParentheses solution = new GenerateParentheses();
        List<String> res1 = solution.generateParenthesis(3); //["((()))","(()())","(())()","()(())","()()()"]
        List<String> res2 = solution.generateParenthesis(1); //["()"]
        System.out.println("Result: ");
        for (int i = 0; i < res1.size(); i++) {
            System.out.print(res1.get(i) + ", ");
        }
        System.out.println(" and ");
        for (int i = 0; i < res2.size(); i++) {
            System.out.print(res2.get(i) + ", ");
        }
    }
}
