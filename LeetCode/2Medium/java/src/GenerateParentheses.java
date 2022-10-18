import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        // TODO: Implement me

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        GenerateParentheses solution = new GenerateParentheses();
        List<String> res1 = solution.generateParenthesis(3); //["((()))","(()())","(())()","()(())","()()()"]
        List<String> res2 = solution.generateParenthesis(1); //["()"]
        System.out.println("Result: ");
        for (int i = 0; i < res1.size(); i++) {
            System.out.print(res1.get(i) + ", ");
        System.out.println(" and ");
        }
        for (int i = 0; i < res2.size(); i++) {
            System.out.print(res2.get(i) + ", ");
        }
    }
}
