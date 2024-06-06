package day2;

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void eat() {
        System.out.println("This animal is eating.");
    }
}

  class Dog extends Animal {
     // Implementation of abstract method
     public void makeSound() {
         System.out.println("Woof Woof");
     }
 }

 class Cat extends Animal {
     // Implementation of abstract method
     public void makeSound() {
         System.out.println("Meow Meow");
     }
 }
 public class Abstruction {
     public static void main(String[] args) {
         // Creating objects of day2.Dog and day2.Cat class
         Animal dog = new Dog();
         Animal cat = new Cat();

         // Calling the implemented methods
         dog.makeSound(); // Outputs: Woof Woof
         dog.eat();       // Outputs: This animal is eating.

         cat.makeSound(); // Outputs: Meow Meow
         cat.eat();       // Outputs: This animal is eating.
     }
 }

