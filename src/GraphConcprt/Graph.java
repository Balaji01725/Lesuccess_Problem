package GraphConcprt;

public class Graph {
    int[][] mat;
    int num_vertices;
    Graph(int num_vertices){
        this.num_vertices=num_vertices;
        mat=new int[num_vertices][num_vertices];
    }
    void addEdge(int source,int destination){
        mat[source][destination]=1;
        mat[destination][source]=1;
    }
    void removeEdge(int source,int destination){
        mat[source][destination]=0;
        mat[source][destination]=0;
    }
    void printGraph(){
        for(int i=0;i<num_vertices;i++){
            for(int j=0;j<num_vertices;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph g=new Graph(5);
        g.addEdge(0,1);
        g.addEdge(1,4);
        g.addEdge(4,3);
        g.addEdge(3,2);
        g.addEdge(2,0);
        g.printGraph();
    }
}
