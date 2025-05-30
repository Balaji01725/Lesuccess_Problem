package Day7;
class classe{
    public void hello(){
        System.out.println("Hello....");
    }
}
class classf extends classe{
    public void hi(){
        System.out.println("Hi....");
    }
}
class classg extends classf{
    public void hey(){
        System.out.println("Hey....");
    }
}
public class classMultilevel {
    public static void main(String[] args) {
        classg obj=new classg();
        obj.hello();
        obj.hi();
        obj.hey();
    }
}
