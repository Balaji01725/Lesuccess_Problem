package Assignment15;
import java.util.*;
public class letterCombinaton {
    static String[] keyboard={"", "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String str="23";
        System.out.println(combination(str));
    }
    static List<String> combination(String str){
        List<String> ds=new ArrayList<>();
        StringBuilder ans=new StringBuilder();
        if(str.equals("")) return ds;
        int ind=0;
        key(ind,str,ds,ans);
        return ds;

    }
    static void key(int ind,String str,List<String> ds,StringBuilder ans){
        if(ind==str.length()){
            ds.add(ans.toString());
            return;
        }
        String key=keyboard[str.charAt(ind)-'0'];

        for(int i=0;i<key.length();i++){
            ans.append(key.charAt(i));
            key(ind+1,str,ds,ans);
            //backtrack
            ans.deleteCharAt(ans.length()-1);
        }
    }
}
