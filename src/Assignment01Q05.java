public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i==j) {
            return 0;
        }
        int n = m.length;
        boolean[] visited = new boolean[n];
        visited[i] = true;
        int[] queue = new int[n];
        int head = 0;
        int tail = 0;
        queue[tail] = i;
        tail++;
        int[] distance = new int[n];
        while (head < tail) {
            int current = queue[head];
            head++;
            for (int k = 0; k < n; k++) {
                if (m[current][k] == 1 && !visited[k]) {
                    visited[k] = true;
                    distance[k] = distance[current] + 1;
                    if (k == j) {
                        return distance[k];
                    }
                    queue[tail] = k;
                    tail++;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}