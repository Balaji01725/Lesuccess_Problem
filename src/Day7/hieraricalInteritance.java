package Day7;
class classh{
    public void hello(){
        System.out.println("Hello");
    }
}
class classi extends classh{
    public void hi(){
        System.out.println("Hi");
    }
}
class classj extends classh{
    public void hey(){
        System.out.println("Hey");
    }
}
public class hieraricalInteritance {
    public static void main(String[] args) {
        classi obj=new classi();
        obj.hi();
        obj.hello();
        classj obj2=new classj();
        obj2.hello();
        obj2.hey();
    }

}
