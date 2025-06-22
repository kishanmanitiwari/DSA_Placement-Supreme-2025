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

interface Pet {
    // Java 8< - It only had Abstact methods

    void dance(); // Abstract method
    void play(); // Abstract method
    void walk(); // Abstract method

    //Java >8 - It can have default methods and static methods , final variable

    // default method
    default void loving() {
        System.out.println("Loving the pet.");
    }

     //default
    default void loyal() {
        System.out.println("Pet Animal is Loyal");
    }

    // static method - Static? - Use this without creating an object
    //Pet.feed(); - This is how we call static method of interface
    static void feed() {
        System.out.println("Feeding the pet.");
    }

    final int MAX_AGE = 20; // Final variable (constant)
    // This is a constant and cannot be changed.
    
}

interface domesticAnimal{
    void cute(); // Abstract method
    void friendly(); // Abstract method


    //default
    default void loyal() {
        System.out.println("Domestic Animal is Loyal");
    }
}

class Dog extends Animal implements Pet{
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

    @Override
    public void dance() {
        System.err.println(name + " is dancing.");
    }

    @Override
    public void play() {
       System.err.println(name + " is playing.");
    }

    @Override
    public void walk() {
        System.err.println(name + " is walking.");
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

class Cow extends Animal implements Pet,domesticAnimal{

    public Cow(String name, int age){
        super(name, age); // Call the constructor of the superclass (Animal)
        System.out.println("Cow constructor called.");
    }

    public void loyal(){
        domesticAnimal.super.loyal(); // Call the default method of the domesticAnimal interface
    }

    @Override
    public void cute() {
        System.out.println("Cow is cute.");
    }

    @Override
    public void friendly() {
        System.out.println("Cow is friendly.");
    }

    @Override
    public void dance() {
        System.out.println("Cow is dancing.");
    }

    @Override
    public void play() {
        System.out.println("Cow is playing.");
    }

    @Override
    public void walk() {
        System.out.println("Cow is walking.");
    }

    @Override
    public void makeSound() {
        System.out.println("Cow says Moo Moo");
    }

    @Override
    public void sleep() {
        System.out.println("Cow is sleeping.");
    }
   

}

class CowBrown implements Pet,domesticAnimal{

    //Upsatging
    // When an interface has duplicate default methods there is an ambiguity
    //There are 2 ways to solve this ambiguity
    //1) Overide the duplicate
    //2) Specify which method to run - Pet.super.method() or domesticAnimal.super.method()

    //In this case we will override the duplicate method
    //and provide our own implementation
    //This is called upcasting

    @Override
    public void loyal(){
        System.out.println("Cow is loyal.");
    }
  
    @Override
    public void cute() {
        System.out.println("Cow is cute.");
    }

    @Override
    public void friendly() {
        System.out.println("Cow is friendly.");
    }

    @Override
    public void dance() {
        System.out.println("Cow is dancing.");
    }

    @Override
    public void play() {
        System.out.println("Cow is playing.");
    }

    @Override
    public void walk() {
        System.out.println("Cow is walking.");
    }
   

}

public class AbstractionExamples{
    public static void main(String[] args) {
        // Dog dog = new Dog("Tommy", 5); // Create a Dog object
        // dog.makeSound(); // Call the makeSound method - Dog
        // dog.eat(); // Call the eat method - Animal
        // dog.sleep(); // Call the sleep method - Dog

        // dog.walk(); // Call the walk method - Dog - Which is an interface method
        // dog.play(); // Call the play method - Dog - Which is an interface method

        // dog.loving(); // Call the loving method - Pet - Which is an interface method
        // Pet.feed(); // Call the static method - Pet - Which is an interface Static Method
        // System.out.println(Pet.MAX_AGE); // Call the final variable - Pet - Which is an interface Final Variable
        // // Pet.MAX_AGE = 30; // This will give an error because MAX_AGE is a final variable and cannot be changed.



        // Cat cat = new Cat("Kitty", 3); // Create a Cat object
        // cat.makeSound(); // Call the makeSound method - Cat
        // cat.eat(); // Call the eat method - Animal
        // cat.sleep(); // Call the sleep method - Cat

        CowBrown cowBrown = new CowBrown(); // Create a Cow object
        cowBrown.cute(); // Call the makeSound method - Cow
        cowBrown.dance(); // Call the eat method - Animal
        cowBrown.loyal(); //We have overidden the duplicate method
    }
}