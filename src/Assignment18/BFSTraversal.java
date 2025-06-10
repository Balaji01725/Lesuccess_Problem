package Assignment18;
import java.util.*;
public class BFSTraversal {
    public static void main(String[] args) {
     int v=5;
     List<List<Integer>> adj=new ArrayList<>();
     for(int i=0;i<v;i++){
         adj.add(new ArrayList<>());
     }
        adj.get(0).addAll(Arrays.asList(1,2));
        adj.get(1).addAll(Arrays.asList(0,2,3));
        adj.get(2).addAll(Arrays.asList(0,1,4));
        adj.get(3).addAll(Arrays.asList(1,4));
        adj.get(4).addAll(Arrays.asList(2,3));

        List<Integer> result=BFS(adj,v);
        System.out.println(result);

    }
    static List<Integer> BFS(List<List<Integer>> adj,int v){
     List<Integer> bfsResult=new ArrayList<>();
     boolean[] visited=new boolean[v];
     Queue<Integer> q=new LinkedList<>();

     q.add(0);
     visited[0]=true;
     while(!q.isEmpty()){
         int node=q.poll();
         bfsResult.add(node);

         for(int n:adj.get(node)){
             if(!visited[n]){
                 q.add(n);
                 visited[n]=true;
             }
         }
     }
     return bfsResult;
    }
}
