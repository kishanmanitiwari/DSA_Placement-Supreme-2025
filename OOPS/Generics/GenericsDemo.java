package Generics;
//Learning Generics in Java

//Generics allow you to create classes, interfaces, and methods with a Placeholder for the type of data they operate on. - Which are indepenent of the data type.

//This means you can create a single class or method that can work with different types of data without needing to overload or create multiple versions of the same code.

//This allows for code reusability and type safety at compile time.


class Student<T>{
    T id;
   
    void setData(T id){
        this.id = id;
        
    }

    void getData(){
        System.out.println("The student id is "+id);
    }
}

public class GenericsDemo{

    //Bounded Generic Method

    //This method accepts a type parameter T that is bounded by the Number class, meaning it can only accept Number or its subclasses (like Integer, Double, etc.)
    
    public static <T extends Number> void printMe(T value) {
        System.out.println("Value: " + value);
    } // This method uses generics to accept any type of data

    public static void printMe(int value) {
    System.out.println("Integer: " + value);
    }

    public static void printMe(String value) {
    System.out.println("String: " + value);
    } // This method is overloaded to accept a String parameter

    //The problem is - Alag data type ke liye alag method likhna padega - which is not a good practice -
    //So, we can use Generics - which is a feature in Java that allows you to create classes, interfaces, and methods with a placeholder for the type of data they operate on.

    public static <T> void printMe(T value) {
        System.out.println("Value: " + value);
    } // This method uses generics to accept any type of data

    //We cancreate return type as generic too

    static <A> A getValue(A value) {
        return value;
    } // This method uses generics to return any type of data

    public static void main(String[] args) {
        // printMe(10); // This will print "Integer: 10"
        // printMe("Hello"); // This will cause a compile-time error because the method expects an int
        // printMe(19.24); // Double
        // printMe("Hello");  //String
        // printMe(10); // Integer
        // printMe(10.5f); // Float
        // printMe(true); // Boolean
        // printMe('A'); // Character

        // System.out.println(getValue(10)); // This will print "10"
        // System.out.println(getValue("Hello")); // This will print "Hello"
        // System.out.println(getValue(19.24)); // This will print "19.24"

        // Student student = new Student();
        // student.setData(101);
        // student.getData(); // This will print the student id and name

        Student<Integer> student1 = new Student<>();
        student1.setData(101);
        student1.getData(); // This will print the student id and name

        Student<String> student2 = new Student<>();
        student2.setData("John Doe");
        student2.getData(); // This will print the student id and name


        // HashSet<Integer> set = new HashSet<>();
        // HashSet<String> set1 = new HashSet<>();
       


    }
}