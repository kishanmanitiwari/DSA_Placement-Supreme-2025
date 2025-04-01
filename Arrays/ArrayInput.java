package Arrays;
import java.util.Scanner;

public class ArrayInput {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] myArray = new int[5];

    //Length - Array

    System.out.println("The length of array is " + myArray.length); //Array length

    //Array - Input - User
    for(int index=0;index<5;index++){
        myArray[index] = input.nextInt();
    }
    
    //Array element print
    for(int index=0;index<myArray.length;index++){
        System.out.println("Array elements at index " + index + " is " + myArray[index]);
    }



    input.close();
  }
}
