public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        //TODO: Implement Dijkstras algorithm, based on some graph structure of the flights
        return -1;
    }

    public static void main(String[] args) {
        CheapestFlightsWithinKStops solution = new CheapestFlightsWithinKStops();
        int res = solution.findCheapestPrice(4, new int[][] {{0,1,100}, {1,2,100}, {2,0,100}, {1,3,600}, {2,3,200}}, 0, 3, 1);
        System.out.println(res);
    }
}
