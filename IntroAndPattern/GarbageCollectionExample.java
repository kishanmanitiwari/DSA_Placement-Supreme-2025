package IntroAndPattern;
public class GarbageCollectionExample {
    public static void main(String[] args) {
        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        obj1 = null; // Object is no longer needed

        System.gc(); // Request cleanup - but this work is automatic in java
        System.out.println("Program finished");
     
    }
}

