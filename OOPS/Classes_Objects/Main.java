class Student {
    int id;
    String name;


    //constructor - Default constructor - Simple method
    Student(){
        System.out.println("Deafult constructor called");
    }

    //Paramterized Constructor - Constructor Overloading - C2
    Student(String name){
        System.out.println("The student name is "+name);
    }

    //C3
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }


}


public class Main {
    public static void main(String[] args) {
       // Student student1 = new Student();
        //Student student2 = new Student("Sahil");
        Student student3 = new Student(103,"Sanika");
        System.out.println(student3.name);
        
    }
    
}
