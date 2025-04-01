package Arrays;

    public class ArrayReferenceExample {
        public static void main(String[] args) {

            int[] arr1 = {10, 20, 30};
            int[] arr2 = arr1; // Both point to the same array
    
            arr2[0] = 99;
    
            // Printing both arrays
            System.out.println("arr1: " + arr1[0]); // 99
            System.out.println("arr2: " + arr2[0]); // 99
        }
    }
    

