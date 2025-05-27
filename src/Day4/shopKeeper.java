package Day4;

public class shopKeeper {
    public static void main(String[] args) {
        int[] arr={60,30};
        if(findTransaction(arr)){
            System.out.println("transaction passed....");
        }else{
            System.out.println("Transaction failed....");
        }

    }
    static boolean findTransaction(int[] arr){
        int c30=0;
        int c60=0;
        int c120=0;
        for(int i=0;i<arr.length;i++) {
            if (c30 == arr[i]) {
                c30++;
            } else if (c60 == arr[i]) {
                if (c30 > 0) {
                    c30--;
                } else {
                    return false;
                }
                c60++;
            }

            else if(c120==arr[i]){
                if(c60>0 && c30>0){
                    c60--;
                    c30--;
                }else if(c30>=3){
                    c30=-30;
                }
                c120++;
            }
        }
        return true;
    }
}
