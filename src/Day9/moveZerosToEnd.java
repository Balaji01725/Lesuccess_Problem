package Day9;

public class moveZerosToEnd {
    public static void main(String[] args) {
     int[] arr={4,5,0,1,9,0,5,0};
     moveZeros(arr);
     for(int i:arr){
         System.out.print(i+" ");
     }
    }
    static void moveZeros(int[] arr){
        int nz=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[nz];
                arr[nz]=temp;
                nz++;
            }
        }
    }
}
