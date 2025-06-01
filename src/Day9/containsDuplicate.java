package Day9;
import java.util.*;
public class containsDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,5,7,5,8,9};
        System.out.println(find(arr));
    }
    static int  find(int[] arr){
        int flag=0;
        Set<Integer> set=new HashSet<>();
        for(int i:arr){
            if(!set.add(i)){
                 flag=arr[i];
                break;
            }
        }
        return flag;
    }
}
