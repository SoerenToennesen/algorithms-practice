public class FindingTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {

        return -1;
    }

    public static void main(String[] args) {
        FindingTheIndexOfTheFirstOccurrenceInAString solution = new FindingTheIndexOfTheFirstOccurrenceInAString();
        int res1 = solution.strStr("sadbutsad", "sad"); //0
        int res2 = solution.strStr("leetcode", "leeto"); //-1
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
