package Queue;
import java.util.*;
public class stackUsingQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;
    stackUsingQueue(){
     q1=new LinkedList<>();
     q2=new LinkedList<>();
    }
    void push(int x){
        q1.offer(x);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
        Queue<Integer> temp=new LinkedList<>();
        temp=q1;
        q1=q2;
        q2=temp;
    }
    int poll(){
        return q2.poll();
    }
    int top(){
        return q2.peek();
    }
    boolean isEmpty(){
        return q2.isEmpty();
    }
    public static void main(String[] args) {
     stackUsingQueue s=new stackUsingQueue();
     s.push(1);
        s.push(1);
        s.poll();
        s.push(1);
    }
}
