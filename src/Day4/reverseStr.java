package Day4;

import java.util.Locale;
import java.util.*;

public class reverseStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String flag=str;
        char[] ch=str.toCharArray();
        String res="";
        for(int i=ch.length-1;i>=0;i--){
            res=res+ch[i];
        }
        System.out.println(res);
    }
}
