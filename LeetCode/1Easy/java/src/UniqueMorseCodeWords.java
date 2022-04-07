
// 804. Unique Morse Code Words

import java.util.Map;

class UniqueMorseCodeWords {
    private static final Map<Character, String> morseCodes = Map.ofEntries(
            Map.entry('a', "..."),
            Map.entry('a', "..."),
            Map.entry('a', "..."),
            Map.entry('a', "..."),
            Map.entry('a', "..."),
            Map.entry('a', "..."),
            Map.entry('a', "..."),
            Map.entry('a', "..."),
            Map.entry('a', "..."),
            Map.entry('a', "..."),
            Map.entry('a', "..."),
            Map.entry('a', "..."),
            Map.entry('a', "..."),
    );
    public int solution(String[] words) {

        return words.length;
    }

    public static void main(String[] args) {
        UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();
        System.out.println(uniqueMorseCodeWords.solution(new String[] {"gin", "zen", "gig", "msg"}));
    }
}

