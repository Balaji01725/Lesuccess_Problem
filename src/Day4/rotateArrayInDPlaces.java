package Day4;

public class rotateArrayInDPlaces {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int d=2;
        rotate(arr,d);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void rotate(int[] arr,int d){
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    static void reverse(int[] arr,int l,int r){
          while(l<r){
              swap(arr,l,r);
              l++;
              r--;
          }
    }
    static void swap(int[] arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
