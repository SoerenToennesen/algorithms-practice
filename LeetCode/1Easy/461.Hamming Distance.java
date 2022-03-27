import java.lang.*;

class HammingDistance {

    public int solution(int x, int y) {
        return bitCount(x ^ y);
    }

    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        System.out.println(hammingDistance.solution(1,4));
    }
}

