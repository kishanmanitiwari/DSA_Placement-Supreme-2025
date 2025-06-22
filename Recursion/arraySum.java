public class arraySum {
    
    public static int arrSumItr(int arr[]){
        int n = arr.length;
        int sum =0;

        for(int i = 0; i < n; i++){
         sum+= arr[i];
        }
    
        return sum;
    }

    static int arraySumRec(int arr[], int startIndex){
        //base case
        if(startIndex == arr.length){
            return 0;
        }else{
            //recursive case
            int recAns = arraySumRec(arr, startIndex+1); //head recursion
            //Step 3 - Operation
            return arr[startIndex] + recAns;
        }
    }

    static String reverseStringRecTail(String str, int startIndex){
        int lastIndex = str.length()-1;
        return helper(str, lastIndex, "");
    }

    public static String reverseStringHead(String str) {
        if (str.isEmpty()) return "";  // Base case
        String recAns = reverseStringHead(str.substring(1));

        return recAns + str.charAt(0);  // Concatenate the first character at the end
    }
    
    static String helper(String str, int lastIndex, String ans){

        //base case
        if(lastIndex < 0 || str.length() == 0){
            return ans;
        }else{
            ans += str.charAt(lastIndex); 
            //recursive case
            return helper(str, lastIndex-1, ans); //tail recursion
        }
        
    }

    public static void main(String[] args) {
        // int arr[] = {2, 3, 4};
        // int sum = arraySumRec(arr,3);
        // System.out.println("Sum of array elements is: " + sum);
        // // Output: Sum of array elements is: 15

        String str = "ANT";
        System.out.println(reverseStringRecTail(str, 0));
    }
}
    
    
        