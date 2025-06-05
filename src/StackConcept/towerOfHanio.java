package StackConcept;
import java.util.*;
public class towerOfHanio {
    static Stack<Integer> source=new Stack<>();
    static Stack<Integer> Accelery=new Stack<>();
    static Stack<Integer> destination=new Stack<>();
    public static void main(String[] args) {
        char s='s';
        char a='a';
        char d='d';
        int n=3;
        double moves=Math.pow(2,n)-1;
        for(int j=3;j>=1;j--){
            source.push(j);
        }
        for(int i=1;i<=moves;i++){
            if(i%3==1){

            }
        }
    }
    static int findMoves(int n,double moves){

    }
}
