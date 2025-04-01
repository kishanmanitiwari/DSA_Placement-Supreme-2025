package TwoDArrays;
public class TwoDArrayPrac {
   
        public static void main(String[] args) {
            int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            System.out.println(arr[0]); // Should print different memory address
            System.out.println(arr[1]);
            System.out.println(arr[2]);
    
            // Print actual contents
            for (int i = 0; i < arr.length; i++) {
                System.out.println(java.util.Arrays.toString(arr[i]));
            }
        }
    
}
