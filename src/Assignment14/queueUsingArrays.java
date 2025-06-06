package Assignment14;
import java.util.*;
public class queueUsingArrays {
    int capacity;
    int[] arr;
    int front;
    int rear;
    queueUsingArrays(int capacity){
        this.capacity=capacity;
        this.arr=new int[capacity];
        this.front=-1;
        this.rear=-1;
    }
    void enQueue(int data){
        if(isFULL()){
            System.out.println("Stack is full..");
        }else{
            arr[++rear]=data;
        }
    }
    int deQUeue(){
        if(isEmpty()){
            System.out.println("Stack is empty..");
        }
            return arr[front++];
    }
    boolean isFULL(){
        return rear==capacity-1;
    }
    boolean isEmpty(){
        return capacity==-1||rear==-1;
    }
    public static void main(String[] args) {
        queueUsingArrays q=new queueUsingArrays(5);
        q.front=0;
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        System.out.println(q.deQUeue());
        System.out.println(q.deQUeue());
        System.out.println(q.isEmpty());
        System.out.println(q.isFULL());

    }
}
