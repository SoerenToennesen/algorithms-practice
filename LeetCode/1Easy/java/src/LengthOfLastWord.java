
// 58. Length of Last Word

class LengthOfLastWord {
    public int solution(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (res == 0 && s.charAt(i) == ' ') {
                continue;
            } else if (s.charAt(i) == ' ') {
                return res;
            } else {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.solution("Hello World")); //5
        System.out.println(lengthOfLastWord.solution("   fly me   to   the moon  ")); //4
        System.out.println(lengthOfLastWord.solution("luffy is still joyboy")); //6
    }
}

