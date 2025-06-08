package Assignment15;

import java.util.*;

public class rateInAMaze {
    public static void main(String[] args) {
      int n=4;
      int[][] maze={{1,0,0,0},{1,1,0,0},{1,1,0,0},{0,1,1,1}};
      List<String> res=findPath(maze,n);
      if(res.size()>0){
          for(int i=0;i<res.size();i++){
              System.out.println(res.get(i)+" ");
              System.out.println();
          }
      }else{
          System.out.println(-1);
      }

    }
    static void move(int i, int j, int[][] maze, int n, List<String> ans,String move,int[][] vis){
        if(i==n-1 && j==n-1){
            ans.add(move);
            return;
        }
        //down
        if(i+1<n && vis[i+1][j]==0 && maze[i+1][j]==1){
            vis[i][j]=1;
            move(i+1,j,maze,n,ans,move+'D',vis);
            vis[i][j]=0;
        }
        //left
        if(j-1>=0 && vis[i][j-1]==0 && maze[i][j-1]==1){
            vis[i][j]=1;
            move(i,j-1,maze,n,ans,move+'l',vis);
            vis[i][j]=0;
        }
        //right
        if(j+1<n && vis[i][j+1]==0 && maze[i][j+1]==1){
            vis[i][j]=1;
            move(i,j+1,maze,n,ans,move+'r',vis);
            vis[i][j]=0;
        }
        //up
        if(i-1>=0 && vis[i-1][j]==0 && maze[i-1][j]==1){
            vis[i][j]=1;
            move(i-1,j,maze,n,ans,move+'u',vis);
            vis[i][j]=0;
        }
    }
    static List<String> findPath(int[][] maze,int n){
        int[][] vis=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                vis[i][j]=0;
            }
        }
        List<String> ans=new ArrayList<>();
        if(maze[0][0]==1) move(0,0,maze,n,ans,"",vis);
        return ans;
    }
}
