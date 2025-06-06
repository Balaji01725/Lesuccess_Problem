package Assignment14;
import java.util.*;
public class reverseFirstQueueElements {
    public static void main(String[] args) {
        reverseFirstQueueElements r=new reverseFirstQueueElements();
        Queue<Integer> q=new LinkedList<>();
        int k=3;
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        reverse(k,q);
        System.out.println(q);
    }
    static void reverse(int k,Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<k;i++){
         s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.offer(s.pop());
        }
        int remaining=q.size()-k;
        for(int i=0;i<remaining;i++){
            q.offer(q.poll());
        }
    }
}
