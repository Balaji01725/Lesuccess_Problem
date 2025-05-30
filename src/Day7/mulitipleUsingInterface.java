package Day7;
interface  classx{
     public void call();
}
interface classy{
    public void chat();
}
class classz implements classx, classy{
    public void call(){
        System.out.println("Calling...");
    }
    public void chat(){
        System.out.println("messaging....");
    }
    public void msg(){
        System.out.println("No msg");
    }
}
public class mulitipleUsingInterface {
    public static void main(String[] args) {
     classz obj=new classz();
     obj.call();
     obj.chat();
     obj.msg();
    }
}
