package Day4;

public class palindromeOrNot {
    public static void main(String[] args) {
        String str="madasdfm";
        if(findPalindrome(str)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    static boolean findPalindrome(String str){
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
