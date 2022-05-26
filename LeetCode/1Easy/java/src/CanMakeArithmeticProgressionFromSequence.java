
// 1502. Can Make Arithmetic Progression From Sequence

import java.util.Arrays;

class CanMakeArithmeticProgressionFromSequence {
    public boolean solution(int[] arr) {
        if (arr.length < 2) return true;
        Arrays.sort(arr);
        int difference = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i+1] - arr[i] != difference) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CanMakeArithmeticProgressionFromSequence canMakeArithmeticProgressionFromSequence = new CanMakeArithmeticProgressionFromSequence();
        System.out.println(canMakeArithmeticProgressionFromSequence.solution(new int[] {3,5,1})); //true
        System.out.println(canMakeArithmeticProgressionFromSequence.solution(new int[] {1,2,4})); //false
    }
}

