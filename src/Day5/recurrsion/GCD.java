package Day5.recurrsion;

public class GCD {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println(fun(a,b));
    }
    static int fun(int a,int b){
        if(b==0) return a;
        return fun(b,a%b);
    }
}
