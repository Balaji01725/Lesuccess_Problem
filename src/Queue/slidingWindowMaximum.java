package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class slidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        for(int i:find(arr,k)){
            System.out.print(i+" ");
        }
    }
    static int[] find(int[] arr,int k){
        int n=arr.length;
        int resIndex=0;
        int[] res=new int[n-k+1];
        Deque<Integer> d=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!d.isEmpty() && d.peek()==i-k){
                d.poll();
            }while(!d.isEmpty() && arr[d.peekLast()]<arr[i]){
                d.pollLast();
            }
            d.offer(i);
            if(i>=k-1){
                res[resIndex++]=arr[d.peek()];
            }
        }
        return res;
    }
}
