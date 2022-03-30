
// 13. Roman to Integer

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private static final Map<Character, Integer> romanToIntegerMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    private int solution(String s) {
        int num = 0;
        int checkNext = 0;
        for (char c : s.toCharArray()) {
            if (checkNext != 0) {
                if (romanToIntegerMap.get(c) != checkNext) {
                    num += romanToIntegerMap.get(c) - checkNext;
                } else {
                    num += romanToIntegerMap.get(c) + checkNext;
                }
                checkNext = 0;
            } else {
                if (romanToIntegerMap.get(c) == 1 ||
                    romanToIntegerMap.get(c) == 10 ||
                    romanToIntegerMap.get(c) == 100
                ) {
                    checkNext = romanToIntegerMap.get(c);
                } else {
                    num += romanToIntegerMap.get(c);
                }
            }
        }
        if (checkNext != 0) num += checkNext;
        return num;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        String test1 = "III";
        String test2 = "LVIII";
        String test3 = "MCMXCIV";
        System.out.println(romanToInteger.solution(test1));
        System.out.println(romanToInteger.solution(test2));
        System.out.println(romanToInteger.solution(test3));
    }

}
