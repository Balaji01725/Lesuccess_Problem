package Queue;

import java.util.Stack;

public class queueUsingStacks {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public queueUsingStacks(){
        s1=new Stack<>();
        s2=new Stack<>();
    }
    void push(int x){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    int pop(){
        return s1.pop();
    }
    int peek(){
        return s1.peek();
    }
    boolean isEmpty(){
        return s1.isEmpty();
    }
    public static void main(String[] args) {
     queueUsingStacks q=new queueUsingStacks();
        q.push(1);
        q.push(2);
        q.push(3);
        q.pop();
        q.isEmpty();

    }
}
