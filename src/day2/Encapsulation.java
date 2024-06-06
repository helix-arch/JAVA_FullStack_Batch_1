package day2;

class Person {
    // Private fields (encapsulation)
    private String name;
    private int age;

    // Constructor to initialize fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Method to display person details
    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
// day2.Main.java
public class Encapsulation {
    public static void main(String[] args) {
        // Creating an instance of day2.Person class
        Person person = new Person("Alice", 30);

        // Accessing and modifying fields using getter and setter methods
        System.out.println("Initial State:");
        person.displayPersonInfo();

        // Modifying fields using setter methods
        person.setName("Bob");
        person.setAge(25);

        System.out.println("After Modification:");
        person.displayPersonInfo();


        // Attempting to set an invalid age
        person.setAge(-5);
    }
}
