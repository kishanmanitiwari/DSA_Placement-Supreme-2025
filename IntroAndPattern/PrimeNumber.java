package IntroAndPattern;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int num = input.nextInt();

        if(checkPrimeOptimal(num)==true){
            System.out.println("Prime Number");
        }else{
            System.out.println("Non-Prime Number");

        }



        input.close();
    }

    static boolean checkPrime(int num){
        //num -13
        for(int i=2;i<num;i++){
            if (num%i==0) {
                return false; //Kisi ne divide kar diya
            }
        }

        return true; //Prime number hai
    }

    static boolean checkPrimeOptimal(int num){
        if (num == 0 || num ==1) {
            return true;
        }
        //num -13
        for(int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0) {
                return false; //Kisi ne divide kar diya
            }
        }

        return true; //Prime number hai
    }
}
