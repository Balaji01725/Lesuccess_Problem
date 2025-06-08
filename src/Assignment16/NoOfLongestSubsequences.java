package Assignment16;

import java.util.Arrays;

public class NoOfLongestSubsequences {
    public static void main(String[] args) {
     int[] arr={1,3,5,4,7};
        System.out.println(find(arr));

    }
    static int find(int[] arr){
        int n=arr.length;
        int[] dp=new int[n];
        int[] cnt=new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(cnt,1);
        int maxLen=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                        cnt[i]=cnt[j];
                    }else if(dp[j]+1==dp[i]){
                        cnt[i]+=cnt[j];
                    }
                }
            }
            maxLen=Math.max(maxLen,dp[i]);
        }
        int total=0;
        for(int i=0;i<n;i++){
            if(dp[i]==maxLen){
                total+=cnt[i];
            }
        }
        return total;
    }
}
