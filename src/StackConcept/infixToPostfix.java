package StackConcept;
import java.util.*;
public class infixToPostfix {
    public static void main(String[] args) {
        String s="a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(convert(s));
    }
    static String convert(String s){
        Stack<Character>  st=new Stack<>();
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder ans=new StringBuilder();
        map.put('+',1);
        map.put('-',1);
        map.put('*',2);
        map.put('/',2);
        map.put('^',3);
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                ans.append(ch);
            }else if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans.append(st.pop());
                }
                st.pop();
            }else{
                if(!st.isEmpty() && map.getOrDefault(ch,0)<=map.getOrDefault(st.peek(),0)){
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
    }
}
