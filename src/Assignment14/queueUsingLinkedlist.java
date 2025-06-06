package Assignment14;
import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class queueUsingLinkedlist {
    Node front,rear;
    queueUsingLinkedlist(){
        this.front=this.rear=null;
    }
    void enqueue(int val){
        Node newNode=new Node(val);
        if(rear==null){
            front=newNode;
            rear=newNode;
        }
        rear.next=newNode;
        rear=newNode;
    }
    int dequeue(){
        if(front==null){
            System.out.println("Empty..");
        }
        return front.val;
    }
    boolean isEmpty(){
        return front==null;
    }

    public static void main(String[] args) {
    queueUsingLinkedlist q=new queueUsingLinkedlist();
    q.enqueue(1);
        q.enqueue(1);
        q.enqueue(1);
        q.enqueue(1);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
    }
}
