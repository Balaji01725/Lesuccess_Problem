package oopsConcept.constructor;

public class car {
    String brand;
    String colour;
    int speed;
    int price;
    car(String brand,String colour){
        this.brand=brand;//this keyword called as the class variable //final keyword we can't change anything
        this.colour=colour;
    }
    car(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        car obj3=new car();
        car obj=new car("Range Rover","white");
        System.out.println(obj.brand);
        System.out.println(obj.colour);
        car obj2=new car("BWW","black");
        System.out.println(obj2.brand);
        System.out.println(obj2.colour);
        obj.run();//not a static
        obj2.start();//not a static
        car.fast();//static without creating an obj

    }
    void run(){
        System.out.println("Car is running");
    }
    void start(){
        System.out.println("Engine Started");
    }
    static void fast(){
        System.out.println("Is this fast");
    }

}
