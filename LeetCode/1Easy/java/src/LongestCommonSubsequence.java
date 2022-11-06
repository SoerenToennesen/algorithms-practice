public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {

        return -1;
    }

    public static void main(String[] args) {
        LongestCommonSubsequence solution = new LongestCommonSubsequence();
        int res1 = solution.longestCommonSubsequence("abcde", "ace"); //3
        int res2 = solution.longestCommonSubsequence("abc", "abc"); //3
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
