import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //Step1: Scanner class ka object
        Scanner input = new Scanner(System.in);

        //Step 2: Take input

        //int - nextInt();
        //double - nextDouble();
        //boolean - nextBoolean();

        int n = 10;

        System.out.println(--n); //11
        System.out.println(n); //11

        input.close();


      
    }
}
