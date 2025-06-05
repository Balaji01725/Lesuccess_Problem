package Assignment12;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        linkedList list=new linkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n=sc.nextInt();
        System.out.println("En terthe values:");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.add(value);
        }

//        list.reverse();
//        list.deleteFirstNode();
//        list.traverse();
//        list.insertBegining(9);
//        list.deleteLast();
//        list.InsertEnd(8);
//        list.deleteMiddle();
//        list.insertKPosition(6);
        list.traverse();
    }
}
