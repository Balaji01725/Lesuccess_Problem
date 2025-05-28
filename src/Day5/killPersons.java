package Day5;

public class killPersons {
    public static void main(String[] args) {
        int n=7;
        int k=3;
        System.out.println(findThePerson(n,k));
    }
    static int findThePerson(int n,int k){
        if(n==1) return 0;
        return(findThePerson(n-1,k)+k)%n;
    }
}
