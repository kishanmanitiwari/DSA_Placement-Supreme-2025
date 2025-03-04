public class ArrayLearning {
    public static void main(String[] args) {
        // //Declare
        // int[] array; //Declaring an array

        // //Initilaise
        // array = new int[10];

        //Intiliase+ declare

        // int[] array = new int[5];
        // System.out.println(array);

        //Index - 0 - n-1
        // Default - 0

        int[] treasureChest = {100, 200, 300, 400, 500};
        //Acess
        // System.out.println(treasureChest[4]);
        // System.out.println(treasureChest[2]);
        // System.out.println(treasureChest[0]);

        //Modify
        System.out.println("Before " + treasureChest[2]);  

        treasureChest[2] = 999;  // 300 → 999 ho gaya!
        System.out.println("After " + treasureChest[2]);  // Output: 999



    }
}
