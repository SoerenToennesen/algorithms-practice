
// 292. Nim Game

class NimGame {
    public boolean solution(int n) {
        if (n <= 3) return true;
        return n % 4 == 0;
    }

    public static void main(String[] args) {
        NimGame nimGame = new NimGame();
        System.out.println(nimGame.solution(4)); //false
        System.out.println(nimGame.solution(1)); //true
        System.out.println(nimGame.solution(1)); //true
    }
}

