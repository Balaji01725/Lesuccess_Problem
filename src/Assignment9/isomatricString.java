package Assignment9;

public class isomatricString {
    public static void main(String[] args) {
        String str="aba";
        int n=10;
        System.out.println(generate(str,n));
    }
    static int generate(String str,int n){
        int len=str.length();
        int count=0;

        for(int i=0;i<len;i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
            int ex=n/len;
            count=count*ex;
            int rem=n%len;
            for(int j=0;j<rem;j++){
                if(str.charAt(j)=='a'){
                    count++;
                }
            }
        return count;
        }

    }

