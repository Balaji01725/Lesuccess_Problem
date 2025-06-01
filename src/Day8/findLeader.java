package Day8;
import java.util.*;
public class findLeader {
    public static void main(String[] args) {
        int[] arr={1,12,84,22,6};
        System.out.println(findLeader(arr));
    }
    static List<Integer> findLeader(int[] arr){
        int n=arr.length;
        int leader=arr[arr.length-1];
        List<Integer> ans=new ArrayList<>();
        ans.add(0,leader);
        for(int i=n-2;i>=0;i--){
            if(leader<arr[i]){
                ans.add(arr[i]);
                leader=arr[i];
            }
        }
        return ans;
    }
}
