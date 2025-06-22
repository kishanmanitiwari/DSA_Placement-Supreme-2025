//Lets Learn Abstraction in Java
//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//It helps to reduce programming complexity and effort.
//Abstraction can be achieved with either abstract classes or interfaces in Java.

//An abstract class is a class that cannot be instantiated, but can be subclassed. It can have abstract methods (without implementation) and concrete methods (with implementation).
//An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors.

//In Java, abstraction is achieved using abstract classes and interfaces. An abstract class can have both abstract and concrete methods, while an interface can only have abstract methods (until Java 8, when default and static methods were introduced).

//In this example, we will create an abstract class and an interface to demonstrate abstraction in Java.
//We will create an abstract class named Animal with an abstract method sound() and a concrete method eat(). We will also create an interface named Pet with a method play().
//We will then create a subclass Dog that extends Animal and implements Pet. The Dog class will provide implementations for the sound() and play() methods.
//Finally, we will create a main class to test the abstraction.

//Abstract class
abstract class Animal {
    //Abstract class can have feilds
    String name;

     // Constructor of abstract class
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    // Abstract method (does not have a body)
    abstract void sound();

    // Regular method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

interface Pet {
//Interface
    // Interface method (does not have a body)
    void play(); //Interface method is public and abstract by default

    // Default method (Java 8 and later)
    default void playWithOwner() {
        System.out.println("Playing with owner.");
    }

    //static method (Java 8 and later)
    static void playWithToys() {
        System.out.println("Playing with toys.");
    }

    default void dance(){
        System.out.println("Pet is dancing.");
    } // Interface method (does not have a body) // This method is also present in Animal class
       
}

//Lets learn significance of Abstract class first
//Dog class that extends Animal 

class Dog extends Animal implements Pet {
    Dog(String name) {
        super(name); // Calls Animal's constructor
        System.out.println("Dog constructor called");
    }

    // Implementation of abstract method
    @Override
    void sound() {
        System.out.println("Woof Woof");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing with a ball.");
    }
}

//Lets do Multiple inheritance using interface
//In Java, a class can implement multiple interfaces, allowing for multiple inheritance of type.
//This means that a class can inherit behavior from multiple sources, which is not possible with classes alone.
//This is one of the key features of interfaces in Java, allowing for a more flexible and modular design.
//In this example, we will create another interface named WildAnimal with a method hunt().
//We will then create a class named Wolf that extends Dog and implements both Pet and WildAnimal interfaces.    

interface WildAnimal {
    void hunt(); // Interface method (does not have a body)

    default void dance(){
        System.out.println("Wild animal is dancing.");
    } // Interface method (does not have a body) // This method is also present in Pet interface
}

//We will create a class named Wolf that extends Dog and implements both Pet and WildAnimal interfaces.

//I want wolf to implement both Pet and WildAnimal interfaces

// something like this - implement Pet, WildAnimal

class Wolf extends Animal implements WildAnimal,Pet {

    Wolf(String name) {
            super(name);
            System.out.println("Wolf constructor called");
        }
    
        @Override
    public void play() {
        System.out.println("Wolf is playing with a stick.");
    }

    @Override
    public void hunt() {
        System.out.println("Wolf is hunting for food.");
    }

    @Override
    void sound() {
        System.out.println("Howl Howl");
    }

    //we have 2 options either we overide dance or we can use default method of Pet interface or WildAnimal interface
    // @Override
    // public void dance() {
    //     System.out.println("Wolf is dancing.");
    // } // Interface method (does not have a body) // This method is also present in Pet interface
    //we can also use default method of Pet interface or WildAnimal interface - Up staging
    public void dance() {
        Pet.super.dance(); // Calls the default method of Pet interface
    }

    //why not pet.dance() - because we are in wolf class and we have to call the method of pet interface
    //we can also use default method of WildAnimal interface - Up staging
    //Basically think Pet and WildAnimal are parents of Wolf class hence the super keyword is used to call the method of parent class
    
   
}

//What will happen if we try to implement the same method in both interfaces?
//In Java, if two interfaces have the same method signature, a class that implements both interfaces must provide an implementation for that method.
//This is because the class must resolve the ambiguity of which interface's method to use.
//If the class does not provide an implementation, it will result in a compilation error.
//To resolve this, the class can either provide its own implementation or explicitly specify which interface's method to use using the interface name.
//In this example, we will create two interfaces named Animal and Pet, both having a method named play().
//We will then create a class named Cat that implements both interfaces and provides its own implementation for the play() method.
//We will also demonstrate how to resolve the ambiguity by explicitly specifying which interface's method to use.


public class AbstractionExample {
    public static void main(String[] args) {
         Dog d = new Dog("Buddy");
         d.sound(); // Calls the sound method of Dog class
         d.play(); // Calls the play method of Dog class
         d.playWithOwner(); // Calls the default method of Pet interface
         Pet.playWithToys(); // Calls the static method of Pet interface
         Wolf w = new Wolf("Lobo");
         w.sound(); // Calls the sound method of Wolf class
         w.play(); // Calls the play method of Wolf class
         w.playWithOwner(); // Calls the default method of Pet interface
         w.hunt(); // Calls the hunt method of Wolf class
         Pet.playWithToys(); // Calls the static method of Pet interface
    }
}

