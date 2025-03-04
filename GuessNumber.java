import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int guessNumber = random.nextInt(100)+1;
        int chance = 10;
        int userGuess;

        System.out.print("Guess a number between 1 - 100 : ");
        userGuess = input.nextInt();
        chance--;
        boolean userWin = false;

        if (userGuess==guessNumber) {
            userWin = true;
            System.out.println("Thats correct: "+userGuess);
        }else{
            while (userGuess!=guessNumber && (chance>0)) {
                if (userGuess>guessNumber) {
                    System.out.println("Too high!");
                    System.out.print("Chance Left "+chance+" Guess Again: ");
                    userGuess = input.nextInt();
                    if (userGuess==guessNumber) {
                        userWin = true;
                        System.out.println("Thats correct: "+userGuess);
                    }
                    chance--;
                } else if(userGuess<guessNumber) {
                    System.out.println("Too Low!");
                    System.out.print("Chance Left "+chance+ " Guess Again: ");
                    userGuess = input.nextInt();
                    if (userGuess==guessNumber) {
                        userWin = true;
                        System.out.println("Thats correct: "+45);
                    }
                    chance--;
                }else{
                    System.out.println("Thats correct: "+45);
                }
                }
            }

        if (userWin==false) {
            System.out.println("Better Luck Next Time, Right Number was "+guessNumber);
            
        }

        // do {
        //     System.out.print("Guess a number between 1 - 100 : ");
        //     userGuess = input.nextInt();
        //     if (userGuess>guessNumber) {
        //                 System.out.println("Too high!");
        //                 System.out.print("Guess Again: ");
        //                 userGuess = input.nextInt();
        //             } else if(userGuess<guessNumber) {
        //                 System.out.println("Too Low!");
        //                 System.out.print("Guess Again: ");
        //                 userGuess = input.nextInt();
        //             }else{
        //                 System.out.println("Thats correct: "+45);
        //             }
        // } while (userGuess!=guessNumber);

        input.close();
    }
}
