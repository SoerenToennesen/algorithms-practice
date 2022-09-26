public class FindingTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        int charCounter = needle.length();
        int res = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(needle.length() - charCounter)) {
                charCounter--;
                if (res == -1) res = i;
                if (charCounter == 0) return res;
            } else {
                charCounter = needle.length();
                res = -1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FindingTheIndexOfTheFirstOccurrenceInAString solution = new FindingTheIndexOfTheFirstOccurrenceInAString();
        int res1 = solution.strStr("sadbutsad", "sad"); //0
        int res2 = solution.strStr("leetcode", "leeto"); //-1
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
