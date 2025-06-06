package StackConcept;
import java.util.*;
public class towerOfHanio {
    static Stack<Integer> sor=new Stack<>();
    static Stack<Integer> aux=new Stack<>();
    static Stack<Integer> des=new Stack<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        towerOfHanio t=new towerOfHanio();
        int n=sc.nextInt();
        int moves=(int) Math.pow(2,n)-1;
        char a='a';
        char s='s';
        char d='d';
        if(n%2==0){
            char tt=a;
            a=d;
            d=tt;
        }
        for(int i=n;i>=1;i--){
           sor.push(i);
        }
        for(int i=1;i<=moves;i++){
            if(i%3==1){
                t.change(sor,des,s,d);
            }else if(i%3==2){
                t.change(sor,aux,s,a);
            }else if(i%3==0){
                t.change(aux,des,a,d);
            }
        }
    }
    void change(Stack<Integer> s1,Stack<Integer> s2,char c1,char c2){
        int v1,v2;
        if(s1.isEmpty()){
            v1=Integer.MAX_VALUE;
        }else{
            v1=s1.pop();
        }if(s2.isEmpty()){
            v2=Integer.MAX_VALUE;
        }else{
            v2=s2.pop();
        }if(v1==Integer.MAX_VALUE){
            s1.push(v2);
        }else if(v2==Integer.MAX_VALUE){
            s2.push(v1);
        }if(v1<v2){
            s2.push(v2);
            s2.push(v1);
            System.out.println(c1 +"--->"+c2);
        }else{
            s1.push(v1);
            s1.push(v2);
            System.out.println(c2 +"--->"+c1);
        }
    }
}
