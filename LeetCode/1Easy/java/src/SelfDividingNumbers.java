
// 728. Self Dividing Numbers

import java.util.ArrayList;
import java.util.List;

class SelfDividingNumbers {
    public List<Integer> solution(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            boolean add = true;
            int temp = 0;
            while(i > 0) {
                temp = i % 10;
                if (temp == 0 || temp % i != 0) {
                    add = false;
                    break;
                }
                i /= 10;
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

