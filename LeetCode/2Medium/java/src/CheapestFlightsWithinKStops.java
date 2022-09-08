import java.util.*;

public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        //TODO: Implement Dijkstras algorithm, based on some graph structure of the flights
        Set<Integer> adj[] = new HashSet[n];
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new HashSet<>();
            dist[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            int v = flights[i][0];
            int w = flights[i][1];
            adj[v-1].add(w-1);
            adj[w-1].add(v-1);
        }
        boolean visted[] = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        visted[src-1] = true;
        queue.add(src-1);

        while (queue.size() != 0) {
            src = queue.poll();
            if (dist[src] < 0) dist[src] = 0;
            Iterator<Integer> iterator = adj[src].iterator();
            while (iterator.hasNext()) {
                int next = iterator.next();
                if (!visted[next]) {
                    visted[next] = true;
                    queue.add(next);
                    dist[next] = dist[src] + flights[src][2];
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (dist[i] != 0) {
                res.add(dist[i]);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        CheapestFlightsWithinKStops solution = new CheapestFlightsWithinKStops();
        int res = solution.findCheapestPrice(4, new int[][] {{0,1,100}, {1,2,100}, {2,0,100}, {1,3,600}, {2,3,200}}, 0, 3, 1);
        System.out.println(res);
    }
}
