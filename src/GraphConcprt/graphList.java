package GraphConcprt;

import java.util.ArrayList;
import java.util.*;
public class graphList {
    List<List<Integer>> adj_list=new ArrayList<>();
    int num_vertices;
    graphList(int num_vertices){
        this.num_vertices=num_vertices;
        adj_list=new ArrayList<>();
        for(int i=0;i<num_vertices;i++){
            adj_list.add(new ArrayList<>());
        }
    }
    void addEdge(int source,int dest){
        adj_list.get(source).add(dest);
        adj_list.get(dest).add(source);

    }
    void remove_edge(int source,int dest){
        adj_list.get(source).remove((Integer)dest);
        adj_list.get(dest).remove((Integer)source);
    }
    void printGraph(){
        for(int i=0;i<num_vertices;i++){
            System.out.print(i+"-->");
            for(int n:adj_list.get(i)){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        graphList g=new graphList(5);
        g.addEdge(0,1);
        g.addEdge(1,4);
        g.addEdge(4,3);
        g.addEdge(3,2);
        g.addEdge(2,0);
        g.printGraph();
    }
}
