package Assignment13;
import java.util.*;
public class removeAdjecentDuplicates {
    public static void main(String[] args) {
        String s="abbaca";
        System.out.println(removeAdj(s));
    }
    static String removeAdj(String s){
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.isEmpty()){
                st.push(ch);
            }else{
                if(st.peek()==ch){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
        return st.toString();
    }
}
