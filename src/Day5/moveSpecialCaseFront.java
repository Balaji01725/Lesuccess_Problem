package Day5;

public class moveSpecialCaseFront {
    public static void main(String[] args) {
        String str="psr-tr-ain-ing";
        System.out.println(moveSpecialCase(str));
    }
    static String moveSpecialCase(String str){
        String temp="";
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                ans.append(str.charAt(i));
            }else{
                temp+=str.charAt(i);
            }
        }
        ans.append(temp);
        return ans.toString();
    }
}
