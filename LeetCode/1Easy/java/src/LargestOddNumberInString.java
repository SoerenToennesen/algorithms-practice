
// 1903. Largest Odd Number in String

class LargestOddNumberInString {
    public String solution(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (Integer.parseInt(String.valueOf(num.charAt(i))) % 2 == 1) {
                return num.substring(0, i+1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        LargestOddNumberInString largestOddNumberInString = new LargestOddNumberInString();
        System.out.println(largestOddNumberInString.solution("52")); //"5"
        System.out.println(largestOddNumberInString.solution("4206")); //""
    }
}

