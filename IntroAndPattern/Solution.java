package IntroAndPattern;
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = findPivot(nums);

        if(target>=nums[pivot] && target<=nums[n-1]){
            return binarySearch(nums, pivot, n-1, target); //right side
        }else{
            return binarySearch(nums, 0, pivot-1, target);
        }

    }

    int findPivot(int arr[]){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int mid = (left+right)/2;

            if (arr[mid]>arr[right]) {
                left = mid;
            }else{
                right = mid;
            }
        }

        return left;
            
    }

    // Standard Binary Search
    private int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        
        return -1;  // Target not found
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        
        int result = solution.search(nums, target);
        System.out.println("Index of target: " + result);
    }
}
