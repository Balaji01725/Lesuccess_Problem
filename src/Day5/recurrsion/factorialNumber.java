package Day5.recurrsion;

public class factorialNumber {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fun(n));
    }
    static int fun(int n){
        if(n==0 ||n==1) return n;
        return fun(n-2)+fun(n-1);

    }
}
