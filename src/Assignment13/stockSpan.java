package Assignment13;

import java.util.Arrays;
import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int[] span=span(price);
        System.out.println(Arrays.toString(span));
    }
    static int[] span(int[] price){
        int n=price.length;
        int[] span=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && price[st.peek()]<=price[i]){
                st.pop();
            }
            span[i]=st.isEmpty()?(i+1) : (i-st.peek());
            st.push(i);
        }
        return span;
    }
}
