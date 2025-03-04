import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number:");
        int num = input.nextInt();
        int ans = sumDigit(num);
                System.out.println("The sum of digit is "+ans);
                input.close();
            }
        
        
    static int sumDigit(int num) {
        //eg: //1234
        int sum = 0;
        while (num>0) {
            int lastDigit = num%10; //Last digit -4
            num/=10; //Number shrink 123
            sum+=lastDigit;
        }

        return sum;
        
    }
}
