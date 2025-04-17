package DSA.HashMap;
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String,Integer> scorecard = new HashMap<>();
        //Insert - Insert or Update
        scorecard.put("Virat",50);
        scorecard.put("Rohit",77);
        scorecard.put("Dhoni",7); //doni retires
       
        scorecard.remove("Dhoni");
    
        //Print
        System.out.println(scorecard);

        //get - Used to retive ya get the value based on key

        System.out.println(scorecard.get("Rohit")); //77
        System.out.println(scorecard.get("pandya")); //null

        //remove
        System.out.println("Removed Dhoni -> " +  scorecard);


        //if key - true //if key - refurns false
        System.out.println(scorecard.containsKey("Virat"));
        System.out.println(scorecard.containsKey("Sachin"));

        System.out.println(scorecard.containsValue(77));
        System.out.println(scorecard.containsValue(100));

        //size
        scorecard.put("KL",104);
        System.out.println("The size is " + scorecard.size()); //2

        //isEmpty() - true // false

        System.out.println(scorecard.isEmpty()); //false

        // scorecard.clear();

         System.out.println(scorecard);

         System.out.println(scorecard.keySet());

         System.out.println(scorecard.values());

        

    }
 
}