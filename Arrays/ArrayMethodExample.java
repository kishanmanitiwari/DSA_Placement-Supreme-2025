package Arrays;
public class ArrayMethodExample {
    static void modifyArray(int[] arr) {
        arr[0] = 100; // Modifies original array
    }

    static int[] randomArray(){
        int[] randomArrayNumber = {1,2,3,4};
        return randomArrayNumber;
    }


    public static void main(String[] args) {
        // int[] myArray = {1, 2, 3};
        // modifyArray(myArray);

        // // Printing modified array
        // System.out.println(myArray[0]); // 100

        int[] retunedArray = randomArray();
        for (int val : retunedArray) {
            System.out.println(val);
        }
    }
}
