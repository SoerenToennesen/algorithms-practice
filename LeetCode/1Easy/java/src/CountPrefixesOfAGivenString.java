
// 2255. Count Prefixes of a Given String

class CountPrefixesOfAGivenString {
    public int solution(String[] words, String s) {
        return -1;
    }

    public static void main(String[] args) {
        CountPrefixesOfAGivenString countPrefixesOfAGivenString = new CountPrefixesOfAGivenString();
        System.out.println(countPrefixesOfAGivenString.solution(new String[] {"a","b","c","ab","bc","abc"}, "abc")); //3
        System.out.println(countPrefixesOfAGivenString.solution(new String[] {"a","a"}, "aa")); //2
    }
}

