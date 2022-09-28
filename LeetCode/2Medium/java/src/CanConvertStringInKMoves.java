import java.util.HashSet;

public class CanConvertStringInKMoves {
    public boolean canConvertString(String s, String t, int k) {
        if (s.length() != t.length()) return false;
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int shift = Math.abs(s.charAt(i) - t.charAt(i));
            if (seen.contains(shift) || shift > k) {
                return false;
            } else {
                seen.add(shift);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CanConvertStringInKMoves solution = new CanConvertStringInKMoves();
        boolean res1 = solution.canConvertString("input", "output", 9); //true
        boolean res2 = solution.canConvertString("abc", "bcd", 10); //false
        boolean res3 = solution.canConvertString("aab", "bbb", 27); //true
        System.out.println("Result: " + res1 + ", " + res2 + ", " + res3);
    }
}
