package Assignment2.primeNumber.simpleCompoundInterestCalculator;

import java.util.Scanner;

public class probelm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.simple interest");
        System.out.println("2.compound interest");
        System.out.println("choose the type");
        int chioce=sc.nextInt();
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();

        if(chioce==1){
            double simple=(p*r*t)/100;
            System.out.println("simple interest"+simple);
        }else if(chioce==2){
            double CI = p * Math.pow((1 + r / 100), t) - p;
            System.out.println("compound interest"+CI);
        }else{
            System.out.println("Invalid choice.......");
        }



    }
}
