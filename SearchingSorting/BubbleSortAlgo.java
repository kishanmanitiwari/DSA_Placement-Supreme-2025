package SearchingSorting;
public class BubbleSortAlgo {

    static void bubbleSort(int[] arr){
        int N = arr.length;
        //Bada elemnt last mein chala jayega
        for (int i = 0; i < N-1; i++) { //Number of pass
            for (int j = 0; j < N-i-1; j++) { //Number of swaps - Sorting 
                //humesha 1 se kam hota rehta 
                if (arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                                    }
                            
                                }
                            }
                        }
                    
    private static void swap(int[] arr, int i, int j) {
            int temp =  arr[j];
            arr[j] = arr[i];
            arr[i] = temp;                     
    }

    static void selectionSort(int arr[]){
       int N = arr.length;
       
       for (int index = 0; index < N-1; index++) { // Pure element passes
            int targetPos = index; //Assume kar rhe hai ki target pos 
            for (int j = index+1; j < N; j++) { //target pos ke liye sahi number
                if (arr[j]<arr[targetPos]) { //sahi number - inex -> target
                    targetPos = j;
                }
            }

            swap(arr, index, targetPos); //elemet - pos -> Swap
       }
    }

    public static void main(String[] args) {
        int[] arr = {8,5,9,1,3};
        //bubbleSort(arr);
        selectionSort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

}