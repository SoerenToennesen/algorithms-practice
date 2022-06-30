import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class ResultBalancedBrackets {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static boolean isClosingBracket(char bracket) {
        if (bracket == '(' || bracket == '[' || bracket == '{') return false;
        else return true;
    }

    public static boolean isValidBracket(char bracket) {
        if (bracket == '(' || bracket == '[' || bracket == '{'
        || bracket == ')' || bracket == ']' || bracket == '}') return true;
        else return false;
    }

    public static boolean isMatchingBracket(char bracket1, char bracket2) {
        if (bracket1 == '(') {
            return bracket2 == ')';
        } else if (bracket1 == '[') {
            return bracket2 == ']';
        } else {
            return bracket2 == '}';
        }
    }

    public static String isBalanced(String s) {
        // Write your code here
        int bracket1 = 0; int bracket2 = 0; int bracket3 = 0;
        List<Character> bracketStack = new ArrayList<>();
        for (int i = 1; i < s.length(); i++) {
            if (!isValidBracket(s.charAt(i))) {
                return "NO";
            }
            if (isClosingBracket(s.charAt(i))) {
                if (bracketStack.isEmpty()) return "NO";
                if (!isMatchingBracket(bracketStack.get(bracketStack.size() - 1), s.charAt(i))) return "NO";
            } else {
                bracketStack.add(s.charAt(i));
            }
        }
        return "YES";
    }

}

public class BalancedBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = ResultBalancedBrackets.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
