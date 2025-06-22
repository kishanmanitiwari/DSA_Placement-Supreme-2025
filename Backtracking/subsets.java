package Backtracking;
import java.util.ArrayList;

class subsets{
    public static void main(String[] args) {
        int[] arr = {1,2};
        ArrayList<Integer> ans = new ArrayList<>();
        printSubsets(0,arr,ans);
            }
        
            private static void printSubsets(int index, int[] arr, ArrayList<Integer> ans) {
                //base case
                int n = arr.length;

                if(index == n){
                    System.out.println(ans);
                    return;
                }

                //Include
                ans.add(arr[index]);
                //explore
                printSubsets(index+1,arr,ans);
                //backtraacking
                ans.remove(ans.size()-1);

                //exclude 
                printSubsets(index+1, arr, ans);
                
            }
}