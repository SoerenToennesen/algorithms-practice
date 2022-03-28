import java.lang.*;

//461. Hamming Distance

class HammingDistance {

    public int solution(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        System.out.println(hammingDistance.solution(1,4));
        System.out.println(hammingDistance.solution(3,1));
    }
}

