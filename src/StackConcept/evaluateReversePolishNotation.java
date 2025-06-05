package StackConcept;
import java.util.*;
public class evaluateReversePolishNotation {
    public static void main(String[] args) {
    String[] tokens={"4","13","5","/","+"};
        System.out.println(find(tokens));
    }
    static int find(String[] tokens){
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            if(isOperator(s)){
                int b=st.pop();
                int a=st.pop();
                switch(s){
                    case "+":
                        st.push(a+b);
                        break;
                    case "-":
                        st.push(a-b);
                        break;
                    case "*":
                        st.push(a*b);
                        break;
                    case"/":
                        st.push(a/b);
                        break;
                }
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
    static boolean isOperator(String s){
        return s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/");
    }
}
