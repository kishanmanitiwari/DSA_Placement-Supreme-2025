//Learening Java Abstraction

//Abstraction is a process of hiding the implementation details and showing only the functionality to the user.
//It helps to reduce complexity and increase efficiency.
//Abstraction can be achieved in Java using abstract classes and interfaces.

//Abstract Class

//An abstract class is a class that cannot be instantiated and can have abstract methods (methods without a body) and concrete methods (methods with a body).
//An abstract class can have constructors, instance variables, and methods.
//An abstract class can be extended by another class, and the subclass MUST implement the abstract methods of the abstract class.
//An abstract class/method can be declared using the keyword 'abstract' before the class/method name.

//Interface

//An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
//Interfaces cannot contain instance variables or constructors.
//An interface can be implemented by a class, and the class MUST implement all the methods of the interface.
//An interface can be declared using the keyword 'interface' before the interface name.
//Interface can be used to achieve multiple inheritance in Java.


abstract class Animal {
    String name; //Instance Variable
    int age;   //Instance Variable

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract void makeSound();

    public abstract void sleep(); // Abstract method

    // Concrete method
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

public interface Pet {
    // Java 8< - It only had Abstact methods

    void dance(); // Abstract method
    void play(); // Abstract method
    void walk(); // Abstract method
    
}


class Dog extends Animal i {
    public Dog(String name, int age){
        super(name, age); // Call the constructor of the superclass (Animal)
        System.out.println("Dog constructor called.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says Bhow Bhow");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

   
    }

class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age); // Call the constructor of the superclass (Animal)
        System.out.println("Cat constructor called.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says Meow Meow");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

   
}




public class AbstractionExamples{
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy", 5); // Create a Dog object
        dog.makeSound(); // Call the makeSound method - Dog
        dog.eat(); // Call the eat method - Animal
        dog.sleep(); // Call the sleep method - Dog

        Cat cat = new Cat("Kitty", 3); // Create a Cat object
        cat.makeSound(); // Call the makeSound method - Cat
        cat.eat(); // Call the eat method - Animal
        cat.sleep(); // Call the sleep method - Cat
    }
}