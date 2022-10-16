public class PalindromicSubstrings {
    private boolean isPalindrome(String s) {
        if (s.length() == 1) return true;
        int p1 = 0;
        int p2 = s.length() - 1;
        while (p1 < p2) {
            if (s.charAt(p1) != s.charAt(p2)) return false;
            p1++;
            p2--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        //int skip = 0; // Skip doesn't work, for the cases when the string is the same
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            //skip = 0;
            for (int j = s.length() - 1; j >= i; j--) {
                if (isPalindrome(s.substring(i, j+1))) {
                    //skip = j - i;
                    res += j - i + 1;
                    break;
                }
            }
            //i += skip;
        }
        return res;
    }

    public static void main(String[] args) {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        int res1 = solution.countSubstrings("abc"); //3
        int res2 = solution.countSubstrings("aaa"); //6
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
