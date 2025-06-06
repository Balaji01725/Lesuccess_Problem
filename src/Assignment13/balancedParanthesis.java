package Assignment13;

import java.util.Stack;

public class balancedParanthesis {
    public static void main(String[] args) {
        String s="({[]})";
        if(paranthesis(s)){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }
    static boolean paranthesis(String s){
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(')');
            }else if(c=='{'){
                st.push('}');
            }else if(c=='['){
                st.push(']');
            }else if(st.isEmpty() || st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty();
    }
}
