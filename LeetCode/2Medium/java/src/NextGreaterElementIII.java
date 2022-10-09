import java.util.ArrayList;
import java.util.HashMap;

public class NextGreaterElementIII {
    public int nextGreaterElement(int n) {
        String strInt = "" + n;
        int[][] digitList = new int[10][2];
        for (int i = 0; i < strInt.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(strInt.charAt(i)));
            if (digitList[digit][0] != digit) {
                digitList[digit][0] = digit;
                digitList[digit][1] = i;
            }
            for (int j = 0; j < 10; j++) {
                if (digitList[j][0] == i && j < digit) {
                    return Integer.parseInt(
                        strInt.substring(0, digitList[j][1] - 1) +
                        digit +
                        strInt.substring(digitList[j][1] + 1, i - 1) +
                        digitList[j][1] +
                        strInt.substring(i + 1));
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        NextGreaterElementIII solution = new NextGreaterElementIII();
        int res1 = solution.nextGreaterElement(12);//21
        int res2 = solution.nextGreaterElement(21);//-1
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
