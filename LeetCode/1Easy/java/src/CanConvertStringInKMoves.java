import java.util.HashSet;
import java.util.Set;

public class CanConvertStringInKMoves {
    public boolean canConvertString(String s, String t, int k) {
        if (s.length() != t.length()) return false;
        if (s.equals(t)) return true;
        Set<Integer> uniqueDifferences = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int difference = s.charAt(i) - t.charAt(i);
            if (difference < 0) difference = 26 - difference;
            if (difference > k) return false;
            if (uniqueDifferences.contains(difference)) return false;
            uniqueDifferences.add(difference);
        }
        return true;
    }

    public static void main(String[] args) {
        CanConvertStringInKMoves solution = new CanConvertStringInKMoves();
        boolean res1 = solution.canConvertString("input", "output", 9); // true
        boolean res2 = solution.canConvertString("aab", "bbb", 27); // true
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
