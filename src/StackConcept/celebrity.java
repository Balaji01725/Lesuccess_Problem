package StackConcept;
import java .util.*;
public class celebrity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print(generate(arr,n));
    }
    static int generate(int[][] arr,int n){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>=2) {
            int a = st.pop();
            int b = st.pop();
            if (arr[a][b] == 1) {
                st.push(b);
            } else {
                st.push(a);
            }
        }
            int pc=st.pop();
            for(int i=0;i<n;i++){
                if(pc!=i){
                    if(arr[pc][i]!=0 || arr[i][pc]!=1){
                        return  -1;
                    }
                }
            }
            return pc;
        }

    }

