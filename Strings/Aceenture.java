package Strings;

import java.util.Arrays;

public class Aceenture {

    static int removeDuplicateArray(int[] arr){
        int n = arr.length;
        int i =0;
        for(int j=1;j<n;j++){
            //will only if non dupplicate
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }

        return i+1;
    }

    static boolean checkAnagrams(String a, String b){
        if(a.length()!=b.length()) return false;

        int aSum = 0;
        int bSum = 0;

        //kunal = k-10 u - 5 n - 3 a 1 l 2 = 21
        //nakul - n -3 a-1 u 5 k-10 l -1 =21

        for(int i=0;i<a.length();i++){
            aSum+=a.charAt(i);
            bSum+=b.charAt(i);
        }

        return aSum==bSum;

    }

    static void moveAllZeroesToEnd(int arr[]){
        int n = arr.length;
        int i = 0; //this will keep a track

        for(int j=0;j<n;j++){
            //non-zero
            if(arr[j]!=0){
                swap(arr,i,j);
                                i++;
                            }
                        }
                    }
                
    private static void swap(int[] arr, int i, int j) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                
    public static void main(String[] args) {
        // int[] arr = {1,1,2,2,3};
        // System.out.println(removeDuplicateArray(arr));

       // System.out.println(checkAnagrams("listen","siltnt"));

       int[] arr = {0, 1, 0, 3,0,0,0,0,14,0,0, 12};
       moveAllZeroesToEnd(arr);
       System.out.println(Arrays.toString(arr));
    }
}