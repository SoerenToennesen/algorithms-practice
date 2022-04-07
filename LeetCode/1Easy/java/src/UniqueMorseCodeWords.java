
// 804. Unique Morse Code Words

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class UniqueMorseCodeWords {
    private static final Map<Character, String> morseCodes = Map.ofEntries(
            Map.entry('a', ".-"),// ".-"    1
            Map.entry('b', "-..."),//"-..." 2
            Map.entry('c', "-.-."),//"-.-." 3
            Map.entry('d', "-.."),//"-.."   4
            Map.entry('e', "."),//"."       5
            Map.entry('f', "..-."),//"..-." 6
            Map.entry('g', "--."),// "--."  7
            Map.entry('h', "...."),//"...." 8
            Map.entry('i', ".."),//".."     9
            Map.entry('j', ".---"),//".---" 10
            Map.entry('k', "-.-"),//"-.-"   11
            Map.entry('l', ".-.."),//".-.." 12
            Map.entry('m', "--"),//"--"     13
            Map.entry('n', "-."),//"-."     14
            Map.entry('o', "---"),//"---"   15
            Map.entry('p', ".--."),//".--." 16
            Map.entry('q', "--.-"),//"--.-" 17
            Map.entry('r', ".-."),//".-."   18
            Map.entry('s', "..."),//"..."   19
            Map.entry('t', "-"),//"-"       20
            Map.entry('u', "..-"),//"..-"   21
            Map.entry('v', "...-"),//"...-" 22
            Map.entry('w', ".--"),//".--"   23
            Map.entry('x', "-..-"),//"-..-" 24
            Map.entry('y', "-.--"),//"-.--" 25
            Map.entry('z', "--..")//"--.." 26
    );
    public int solution(String[] words) {
        Set<String> seenCodes = new HashSet<>();
        for (String word : words) {
            String codebuilder = "";
            for (char c : word.toCharArray()) {
                codebuilder += morseCodes.get(c);
            }
            seenCodes.add(codebuilder);
        }
        return seenCodes.size();
    }

    public static void main(String[] args) {
        UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();
        System.out.println(uniqueMorseCodeWords.solution(new String[] {"gin", "zen", "gig", "msg"}));
    }
}

