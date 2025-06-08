package DynamicProgramming;

public class fibonacci {
    public static void main(String[] args) {
        int n=6;
        System.out.println(find(n));
    }
    static int find(int n){
        int[] dp=new int[n];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-2]+dp[i-1];
        }
        return dp[n-1];
    }
}
