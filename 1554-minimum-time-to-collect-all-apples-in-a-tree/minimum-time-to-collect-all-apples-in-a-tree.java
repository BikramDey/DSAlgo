class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<Integer>[] graph = new List[n];

        for (int i = 0; i < n; ++i)
            graph[i] = new ArrayList<>();

        for (int[] edge : edges) {
            final int u = edge[0];
            final int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }
        return dfs(graph, 0, new boolean[n], hasApple);
    }

    private int dfs(List<Integer>[] graph, int current, boolean[] visited, List<Boolean> hasApple) {
        visited[current] = true;
        int total = 0;
        for (int i : graph[current]) {
            if(visited[i])
                continue;
            int d = dfs(graph, i, visited, hasApple);
            if(d>0 || hasApple.get(i))
                total += d + 2;
        }
        
        return total;
    }
}