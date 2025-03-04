public class Conditional {
    public static void main(String[] args) {
        int marks = 64;


        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if(marks>=70) {
            System.out.println("Grade C");
        }else{
            System.out.println("Pass"); //Else is optional
        }

        // if(voting>=18){
        //     System.out.println("You can vote");
        // }else{
        //     //If less than 18 - this block - excuted
        //     System.out.println("You are a kid");
        // }
    }
}
