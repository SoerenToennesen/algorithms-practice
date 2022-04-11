
// 1967. Number of Strings That Appear as Substrings in Word

class NumberOfStringsThatAppearAsSubstringsInWord {
    public int solution(String[] patterns, String word) {
        int res = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) res++;
        }
        return res;
    }

    public static void main(String[] args) {
        NumberOfStringsThatAppearAsSubstringsInWord numberOfStringsThatAppearAsSubstringsInWord = new NumberOfStringsThatAppearAsSubstringsInWord();
        System.out.println(numberOfStringsThatAppearAsSubstringsInWord.solution(new String[] {"a", "abc", "bc", "d"}, "abc")); // 3
        System.out.println(numberOfStringsThatAppearAsSubstringsInWord.solution(new String[] {"a", "b", "c"}, "aaaaabbbbb")); // 2
    }
}

