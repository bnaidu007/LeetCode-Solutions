import java.util.*;

class Solution {
    class Pair {
        int node, weight;
        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public int[] maxDistance(int V, int src, ArrayList<ArrayList<Integer>> edges) {
        // Step 1: Build Adjacency List
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            int w = edge.get(2);
            adj.get(u).add(new Pair(v, w));
        }

        // Step 2: Get Topological Sort using DFS
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topoSort(i, adj, visited, stack);
            }
        }

        // Step 3: Initialize distance array
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MIN_VALUE);
        dist[src] = 0;

        // Step 4: Process nodes in topological order
        while (!stack.isEmpty()) {
            int u = stack.pop();

            if (dist[u] != Integer.MIN_VALUE) {
                for (Pair neighbor : adj.get(u)) {
                    int v = neighbor.node;
                    int weight = neighbor.weight;

                    if (dist[u] + weight > dist[v]) {
                        dist[v] = dist[u] + weight;
                    }
                }
            }
        }

        return dist;
    }

    private void topoSort(int u, List<List<Pair>> adj, boolean[] visited, Stack<Integer> stack) {
        visited[u] = true;
        for (Pair neighbor : adj.get(u)) {
            if (!visited[neighbor.node]) {
                topoSort(neighbor.node, adj, visited, stack);
            }
        }
        stack.push(u);
    }
}