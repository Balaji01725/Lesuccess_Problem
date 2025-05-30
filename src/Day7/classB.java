package Day7;
 class classA{
    public void sayHello(){
        System.out.println("Hello");
    }
    public void sayHello(String name){
        System.out.println("Hello"+name);
    }
}
public class classB extends classA {
    public static void main(String[] args) {
        classA obj=new classA();
        obj.sayHello();
        obj.sayHello("balaji");
    }
}
