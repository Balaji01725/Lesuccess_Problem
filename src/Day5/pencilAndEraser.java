package Day5;

import java.util.Scanner;

public class pencilAndEraser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int m=sc.nextInt();
        int e=sc.nextInt();
        System.out.println(findCompination(n,p,m,e));
    }
    static int findCompination(int n,int p,int m,int e){
        int totalPencil=fact(n)/(fact(p)*fact(n-p)); //n!/r!*(n-r)!
        int totalErasers=fact(m)/(fact(e)*fact(m-e));
        return totalPencil*totalErasers;
    }
    static int fact(int n){
        if(n<=1) return 1;
        return n*fact(n-1);
    }
}
