import java.util.ArrayList;

public class DFSGRAPH {

    public static void dfs(int node, boolean visited[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list) {
        // making current node as visited

        visited[node] = true;
        list.add(node);

        // getting neightbours nodes
        for (Integer it : adj.get(node)) {
            if (visited[it] == false) {
                dfs(it, visited, adj, list);
            }
        }
    }

    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ls = new ArrayList<>();
        boolean visited[] = new boolean[V + 1];
        visited[0] = true;
        dfs(0, visited, adj, ls);
        return ls;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        ArrayList<Integer> ans = dfsOfGraph(5, adj);
        int n = ans.size();
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
