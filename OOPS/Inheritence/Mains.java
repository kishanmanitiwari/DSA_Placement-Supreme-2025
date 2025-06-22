//Learning Inheritance in Java

// Inheritance is a mechanism in Java by which one class is allowed to inherit the features (fields and methods) of another class.

// The class that inherits is called the subclass (child class) and the class from which it inherits is called the superclass (parent class).

// The subclass can add its own fields and methods in addition to the superclass fields and methods.

// The subclass can also override the methods of the superclass to provide its own implementation. - Overiding 

// Extend - The keyword used to inherit a class is "extends".

class Mobile{
    String brand;
    String model;
    int price;
    int ram;
    int storage;
    int mexapixels;
    int os;
    int battery;

    // void playGames(){
    //     System.out.println("Playing games from Mobile class...");
    // }

    void call() {
        System.out.println("Calling...");
    }

    void message() {
        System.out.println("Messaging...");
    }
}

//Inhertience

class Samsung extends Mobile{
    boolean removableBattery;

    // void playGames(){
    //     System.out.println("Playing games from Samsung Class");
    // }

    void ringtone() {
        System.out.println("Ringtone...");
    }
}

class iphone extends Mobile{
    //Method Overriding

    //This method is overridden from the parent class Mobile
    //Method overiding is -

    //When a subclass provides a specific implementation of a method that is already defined in its superclass.

    //The method in the subclass has the same name, return type, and parameters as the method in the superclass.

    void call(){
        System.out.println("Iphone Calling");
    }
}


// class noting extends Mobile,Samsung{
//     //This class is not valid because Java does not support multiple inheritance.
//     //It cannot extend more than one class at a time.
//     //It will give a compile-time error.
//     //More Than CLass?
//     // Interface - Multiple Inheritance
// }



//Object Class

//The Object class is the root class from which all classes in Java inherit.

//Every class in Java is a subclass of the Object class, either directly or indirectly.

//The Object class provides a set of methods that can be used by all objects in Java, such as equals(), hashCode(), and toString().

//The Object class is defined in the java.lang package, which is automatically imported into every Java program.

 //Important Points

 //Java Doesnt Support Multiple Inheritence
//Java supports single inheritance, meaning a class can inherit from only one superclass at a time.
//WHY - Diamond Problem
//Java does not support multiple inheritance to avoid ambiguity and complexity in the inheritance hierarchy.

//Interface
// Java allows a class to implement multiple interfaces, which can provide similar functionality to multiple inheritance without the associated problems.
// An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. It cannot contain instance fields or constructors.



public class Mains{
    public static void main(String[] args) {
        Samsung s24 = new Samsung();
        // s24.brand = "Samsung";
        s24.call(); //Calling from Mobile class
        // s24.message();
        // s24.removableBattery = true;
        // s24.ringtone();

        //Iphone is indirect child of - Object 
        // Direct Child - Mobile
       // s24.playGames();
        
        //iphone iphone14 = new iphone();
        // iphone14.brand = "iphone";
        // iphone14.call(); //Calling from iphone class (overridden method)
        // iphone14.message();

        // Object obj = new Object(); //Creating an object of the Object class
        // System.out.println(obj.toString()); //Calling the toString() method of the Object class

        //Chronolgy of method call
        // Mains - Child - Parent - Jack Pappa - Error
        

        
       
    }
}