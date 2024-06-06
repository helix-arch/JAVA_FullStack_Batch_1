package day2;

// day2.Parent.java
 class Parent {
    // day2.Parent class fields
    protected String name;

    // day2.Parent class constructor
    public Parent(String name) {
        this.name = name;
    }

    // day2.Parent class method
    public void showName() {
        System.out.println("Name: " + name);
    }
}
// day2.Child.java
class Child extends Parent {
    // day2.Child class fields
    private int age;

    // day2.Child class constructor
    public Child(String name, int age) {
        super(name);      // Calling the parent class constructor
        this.age = age;
    }

    // day2.Child class method
    public void showAge() {
        System.out.println("Age: " + age);
    }
}
// day2.Main.java
public class Inheritance {
    public static void main(String[] args) {
        // Creating an instance of day2.Child class
        Child child = new Child("Ravi", 10);

        // Calling methods from both day2.Parent and day2.Child class
        child.showName(); // Method from day2.Parent class
        child.showAge();  // Method from day2.Child class
    }
}
