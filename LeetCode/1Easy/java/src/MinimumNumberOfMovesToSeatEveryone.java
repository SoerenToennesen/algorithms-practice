
// 2037. Minimum Number of Moves to Seat Everyone

import java.util.Arrays;

class MinimumNumberOfMovesToSeatEveryone {
    public int solution(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int totalMoves = 0;
        for (int i = 0; i < seats.length; i++) {
            totalMoves += Math.abs(seats[i] - students[i]);
        }
        return totalMoves;
    }

    public static void main(String[] args) {
        MinimumNumberOfMovesToSeatEveryone minimumNumberOfMovesToSeatEveryone = new MinimumNumberOfMovesToSeatEveryone();
        System.out.println(minimumNumberOfMovesToSeatEveryone.solution(new int[] {3,1,5}, new int[] {2,7,4})); //4
        System.out.println(minimumNumberOfMovesToSeatEveryone.solution(new int[] {4,1,5,9}, new int[] {1,3,2,6})); //7
    }
}

