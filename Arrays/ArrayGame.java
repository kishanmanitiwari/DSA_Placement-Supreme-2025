package Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(3);
        }

        System.out.println("Guess the number");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] array = {2,2,2,2,2,2,2,2};
        arr[2] = 
        arr[3] = 
        arr[5] = 

    }
}
