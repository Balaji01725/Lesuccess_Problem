package Assignment18;
import java.util.*;
public class DFSTraversal {
    public static void main(String[] args) {
        int v=5;
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);

        adj.get(1).add(0);
        adj.get(1).add(2);

        adj.get(2).add(0);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(2).add(4);

        adj.get(3).add(2);

        adj.get(4).add(2);

        List<Integer> result=DFS(v,adj);
        System.out.println(result);
    }
    static List<Integer> DFS(int v,List<List<Integer>> adj){
        List<Integer> res=new ArrayList<>();
        boolean[] visited=new boolean[v];
        dfs(0,adj,res,visited);
        return res;
    }
    static void dfs(int node,List<List<Integer>> adj,List<Integer> res,boolean[] visited){
        visited[node]=true;
        res.add(node);

        for(int n:adj.get(node)){
            if(!visited[n]){
                dfs(n,adj,res,visited);
            }
        }
    }
}
