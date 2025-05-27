package Day4;

public class subString {
    public static void main(String[] args) {
        String s1 = "hello to the class";
        String s2 = "welcome ";
        int position = 6;
//        System.out.println(s1.substring(0,position)+ s2 + s1.substring( position, s1.length()-1));
        if (position < s1.length()) {
            String res = "";
            for (int i = 0; i < position; i++) {
                res += s1.charAt(i);
            }
            res += s2;
            for (int i = position; i <= s1.length() - 1; i++) {
                res += s1.charAt(i);
            }
            System.out.println(res);
        }else{
            System.out.println("correct the position");
        }
    }
}
