package Assignment7;

public class calculator {
    int result;
    static int operationCount=0;
    public void add(int a,int b){
        result =a+b;
        operationCount++;
        System.out.println("Result"+result);
    }
    static void displayOperationCount(){
        System.out.println("operation count performed"+operationCount);
    }
    public static void main(String[] args) {
     calculator calc=new calculator();
     calc.add(10,20);
     calc.add(20,20);
     displayOperationCount();
    }

}
