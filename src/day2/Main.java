package day2;

class Human{
    int age =20;  // data memeber

    // data methods
    public void Walk(){
        System.out.println("I am walking");
    }
}

public class Main {
    public static void main(String[] args) {

        Human obj=new Human(); // object creation
        obj.Walk();
        System.out.println(obj.age);

        Human obj1=new Human();
        obj1.Walk();

       Human obj2=new Human();
        obj2.Walk();

    }
}
