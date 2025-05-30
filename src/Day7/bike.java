package Day7;

public class bike {
    static int wheels=2;
    String color="white";
    static void speed(int s){
        int max_speed=s;
        System.out.println("local variable speed "+ max_speed);
    }
    void cc(){
        System.out.println("high level");
    }
    public static void main(String[] args) {
        bike obj=new bike();
        System.out.println(obj.color);
        System.out.println(wheels);
        speed(300);
        obj.cc();
    }
}
