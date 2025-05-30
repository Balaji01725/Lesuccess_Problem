package Assignment7;

public class student {
    int rollNo;
    String name;
    student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    student(int rollNo){
        this.rollNo=rollNo;
        this.name="Unknown";
    }
    public void display(){
        System.out.println("RollNo"+ rollNo + "Name" +name);
    }
    public static void main(String[] args) {
     student obj=new student(13,"balaji");
     student obj2=new student(12);
     obj.display();
     obj2.display();
    }
}
