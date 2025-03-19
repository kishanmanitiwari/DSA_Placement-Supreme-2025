import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {1,146,5,7,10,19};
        Arrays.sort(arr);

        // Steps
        //Sort
        //Binary search

        

        if(binarySearch(arr,1)){
                    System.out.println("Element exist");
                }else{
                    System.out.println("Element dont exist");
                }
            }
        
            private static boolean binarySearch(int[] arr,int target) {
                int start = 0;
                int end = arr.length-1;

                while (start<=end) { //Jabtak seacrch space hai
                    int mid = (start+end)/2;

                    if (arr[mid]<target) { // mid element chota hai to aage milega
                        start = mid+1;
                    } else if(arr[mid]>target) { //bada hai to piche milega
                        end = mid - 1;
                    }else{
                        //mid == target - to yhi wo elemt hai
                        return true;
                    }
                }
            
                return false; // not found
            
            }
}
