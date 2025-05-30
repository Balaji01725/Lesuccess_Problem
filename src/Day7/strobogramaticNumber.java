package Day7;

import java.util.HashMap;

public class strobogramaticNumber { //rotate 180 degree
    public static void main(String[] args) {
        String str="7111";
        System.out.println(findStrobogramic(str));
    }
    static boolean findStrobogramic(String str){
        int l=0;
        int r=str.length()-1;
        HashMap<Character,Character> map=new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');
        while(l<=r) {
            if (map.containsKey(str.charAt(l))) {
                if (map.get(str.charAt(l)) == str.charAt(r)) {
                    l++;
                    r--;
                } else {
                    break;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
