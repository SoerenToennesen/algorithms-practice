
// Solution gotten from https://leetcode.com/problems/finding-3-digit-even-numbers/discuss/1998041/Java-simple
// 2094. Finding 3-Digit Even Numbers

import java.util.HashSet;
import java.util.Set;

class FindingThreeDigitEvenNumbers {
    public int[] solution(int[] digits) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) continue;
            for (int j = 0; j < digits.length; j++) {
                if (j == i) continue;
                for (int k = 0; k < digits.length; k++) {
                    if (k == i || k == j) continue;
                    if (digits[k] % 2 == 0) set.add(digits[i] * 100 + digits[j] * 10 + digits[k]);
                }
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        FindingThreeDigitEvenNumbers findingThreeDigitEvenNumbers = new FindingThreeDigitEvenNumbers();
        System.out.println(findingThreeDigitEvenNumbers.solution(new int[] {2,1,3,0})); //[102,120,130,132,210,230,302,310,312,320]
        System.out.println(findingThreeDigitEvenNumbers.solution(new int[] {2,2,8,8,2})); //[222,228,282,288,822,828,882]
        System.out.println(findingThreeDigitEvenNumbers.solution(new int[] {3,7,5})); //[]
    }
}

