
// 728. Self Dividing Numbers

import java.util.ArrayList;
import java.util.List;

class SelfDividingNumbers {
    public List<Integer> solution(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            boolean add = true;
            String strNum = "" + i;
            for (int j = 0; j < strNum.length(); j++) {
                int digit = Integer.parseInt(String.valueOf(strNum.charAt(j)));
                if (digit == 0 || i % digit != 0) {
                    add = false;
                    break;
                }
            }
            if (add) res.add(i);
        }
        return res;
    }
    public static void main(String[] args) {
        SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();
        System.out.println(selfDividingNumbers.solution(1, 22));
        System.out.println(selfDividingNumbers.solution(47, 85));
    }
}

