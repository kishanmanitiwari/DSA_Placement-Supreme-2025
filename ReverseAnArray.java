public class ReverseAnArray {
    //arr = 1,2,3,4,5
    //reverse = 5,4,3,2,1

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start = 0;
        int[] revArr = new int[arr.length];


        for (int i = arr.length-1; i>=0; i--) {
            revArr[start] = arr[i];
            start++;
        }


        for (int i : revArr) {
            System.out.println(i);
        }
    }
}
