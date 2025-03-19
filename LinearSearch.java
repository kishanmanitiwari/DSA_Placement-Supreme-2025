public class LinearSearch {

    static int LinearSearchArray(int[] arr,int target){
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]==target) {
                return index;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] doors = {1,2,3,4,5};
        //I want to search where is value 4 (index)
        int ans = LinearSearchArray(doors,40);
        System.out.println(ans);
    }
}
