import java.util.Arrays;
import java.util.Collections;

class PairsOfSongsWithTotalDurationsDivisibleBySixty {

    private boolean binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) return true;
            if (arr[mid] > x) return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return false;
    }

    public int numPairsDivisibleBy60(int[] time) {
        Arrays.sort(time);
        int res = 0;
        for (int i = 0; i < time.length; i++) {
            int findCurrent = 60 - (time[i] % 60);
            while (findCurrent < time[i]) {
                if (binarySearch(time, 0, time.length - 1, findCurrent)) res++;
                findCurrent += 60;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        PairsOfSongsWithTotalDurationsDivisibleBySixty solution = new PairsOfSongsWithTotalDurationsDivisibleBySixty();
        int res1 = solution.numPairsDivisibleBy60(new int[] {30,20,150,100,40});
        int res2 = solution.numPairsDivisibleBy60(new int[] {30,20,150,100,40});
        System.out.println("Result: " + res1 + ", " + res2);
    }
}