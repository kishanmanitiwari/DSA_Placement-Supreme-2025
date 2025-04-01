package IntroAndPattern;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberSecond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int guessNumber = random.nextInt(10) + 1;
        int chance = 5;
        boolean userWin = false;

        while (chance > 0) {
            System.out.print("Guess a number between 1 - 10: ");
            int userGuess = input.nextInt();
            chance--;

            if (userGuess == guessNumber) {
                userWin = true;
                System.out.println("That's correct: " + userGuess);
                break;
            } else {
                System.out.println(userGuess > guessNumber ? "Too high!" : "Too low!");
                if (chance > 0) {
                    System.out.println("Chances left: " + chance);
                }
            }
        }

        if (!userWin) {
            System.out.println("Better Luck Next Time! The correct number was " + guessNumber);
        }

        input.close();
    }
}
