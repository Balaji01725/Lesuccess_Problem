package Assignment15;
import java.util.*;
public class NQueens {
    public static void main(String[] args) {
        int n=4;
        char[][] nqueens=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                nqueens[i][j]='.';
            }
        }
        List<List<String>> li=new ArrayList<>();
        path(0,li,nqueens);
        System.out.println(li);

    }
    static void path(int col,List<List<String>> li,char[][] nqueens){
        if(col==nqueens.length){
            li.add(constract(nqueens));
            return;
        }
        for(int i=0;i<nqueens.length;i++){
            if(safe(i,col,nqueens)){
                nqueens[i][col]='q';
                path(col+1,li,nqueens);
                nqueens[i][col]='.';
            }
        }
    }
    static boolean safe(int row,int col,char[][] nqueens){
        int dupRow=row;
        int dupCol=col;
        while(row>=0 && col>=0){
            if(nqueens[row][col]=='q') return false;
            row--;
            col--;
        }
        row=dupRow;
        col=dupCol;
        while(col>=0){
            if(nqueens[row][col]=='q') return false;
            col--;
        }
        row=dupRow;
        col=dupCol;
        while(col>=0 && row<nqueens.length){
            if(nqueens[row][col]=='q') return false;
            col--;
            row++;
        }
        return true;
    }
    static List<String> constract(char[][] nqueens){
        List<String> lo=new ArrayList<>();
        for(int i=0;i<nqueens.length;i++){
            String s=new String(nqueens[i]);
            lo.add(s);
        }
        return lo;
    }

}
