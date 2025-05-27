package Day4;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("goodMorningAll");
//        sb.delete(1,3);
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);
        sb.delete(0,5);
        System.out.println(sb);
        sb.deleteCharAt(7);
        System.out.println(sb);
    }
}
