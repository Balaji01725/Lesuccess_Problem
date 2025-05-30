package Day6;

import java.util.Arrays;

public class deletionToMakeDivisible {
    public static void main(String[] args) {
        int[] nums={2,3,2,4,3};
        int[] divideNums={9,6,9,3,15};
        System.out.println(find(nums,divideNums));
    }
    static int find(int[] nums,int[] divideNums){
        Arrays.sort(nums);
        int gcd=divideNums[0];
        for(int i=1;i<divideNums.length;i++){
            gcd=gcd(gcd,divideNums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(gcd%nums[i]==0){
                return i;
            }
        }
        return -1;
    }
    static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
