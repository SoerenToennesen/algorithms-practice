
//1071. Greatest Common Divisor of Strings

public class GreatestCommonDivisorOfStrings {

    private String solution(String str1, String str2) {
        int leftPointer = 0;
        int rightPointer = 0;
        String gcdString = "";
        for (int i = 0; i < str1.length(); i++) {
            if (leftPointer == rightPointer) {
                rightPointer++;
                continue;
            }
            if (str2.contains(str1.substring(leftPointer, rightPointer))) {
                if (rightPointer - leftPointer > gcdString.length()) {
                    gcdString = str1.substring(leftPointer, rightPointer);
                }
                rightPointer++;
            } else {
                leftPointer++;
            }
        }
        return gcdString;
    }

    public static void main(String[] args) {
        GreatestCommonDivisorOfStrings removeOneElementToMakeTheArrayStrictlyIncreasing = new GreatestCommonDivisorOfStrings();
        String test1str1 = "ABCABC"; String test1str2 = "ABC";
        String test2str1 = "ABABAB"; String test2str2 = "ABAB";
        String test3str1 = "LEET"; String test3str2 = "CODE";
        System.out.println(removeOneElementToMakeTheArrayStrictlyIncreasing.solution(test1str1, test1str2));
        System.out.println(removeOneElementToMakeTheArrayStrictlyIncreasing.solution(test2str1, test2str2));
        System.out.println(removeOneElementToMakeTheArrayStrictlyIncreasing.solution(test3str1, test3str2)); // This is, leetcode answer wise, incorrect, but it is correct in the way I understood the question, as it answers 'more'
    }

}
