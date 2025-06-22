
public class Animal{
    //Blurpint of an object
    //Properties
    //Methods

    //1) Properties

    public int legs;
    public String name;
    public boolean isIntellegent;

    //Method - Behaviour
    //method 1
    public void walk(){
        System.out.println("Aimal is walking");
    }


    //method overload - method2
    public void walk(int steps){
        System.out.println("Aimal is walking " + steps + " steps");
    }



    public void talk(){
        System.out.println("Animal is Talkinng");
    }

    public static void eat(){
        System.out.println("Animal is eating");
    }


    
}
