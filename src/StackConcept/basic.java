package StackConcept;

import java.util.*;

public class basic {
    int[] arr;
    int capacity;
    int top;
    basic(int capacity){
        this.capacity=capacity;
        this.arr=new int[capacity];
        this.top=-1;
    }
    void push(int data){
        if(isFUll()){
            System.out.println("Stack is full");
        }else{
            arr[++top]=data;
        }
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            return arr[top--];
        }
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            return arr[top];
        }
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFUll(){
        return capacity==top;
    }
    public static void main(String[] args) {
        basic st=new basic(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.isEmpty();
        st.push(40);
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.push(50);
        System.out.println(st.isEmpty());
        System.out.println(st.isFUll());


    }

}
