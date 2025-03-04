

public class PassValue {

 public static void main(String[] args) {
        int num = 10;
        System.out.println("orignal value before fun call "+num);
        modifyValue(num);
        System.out.println("orignal value is after "+num); 
    }

    static void modifyValue(int x) {

        System.out.println("Before change copy value is "+x);
        x = 100; 
        System.out.println("Copy value is "+x);
    }
    
    
    
}
