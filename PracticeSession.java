
class PracticeSession {

    static void reverseArrayInPlace(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void moveZeroToEnd(int[] arr) {
        int j = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // non-zero element
                swap(arr, i, j);
                j++;
            }
        }
    }

    static int printAllSubarr(int[] arr) {
        int n = arr.length;
        int maxi = 0;

        for (int i = 0; i < n; i++) {
            int tempSum = 0;
            for (int j = i; j < n; j++) {
                tempSum += arr[j];
                if (tempSum > maxi) {
                    maxi = tempSum;
                }

            }
        }

        return maxi;
    }

    static int KadaneAlgo(int[] arr) {
        int meraMaximumProfit = 0;
        int currentProfit = 0;
        for (int val : arr) {
            currentProfit += val;
            if (currentProfit > meraMaximumProfit) {
                meraMaximumProfit = currentProfit;
            }

            if (currentProfit < 0) { // aapme kuch aisa add kar diya jisse mera loss hogya
                currentProfit = 0; // wapas pas start karenge
            }
        }

        return meraMaximumProfit;
    }

    static int findInRotatedArray(int[] nums, int target){
        int n = nums.length;
        
        // Step 1: Find the pivot index (smallest element's index)
        int pivot = findPivot(nums);
        System.out.println("the pivot is "+ pivot);
        
        // Step 2: Perform binary search in the appropriate part of the array
        if (target >= nums[pivot] && target <= nums[n - 1]) {
            return binarySearch(nums, pivot, n - 1, target);  // Search right part
        } else {
            return binarySearch(nums, 0, pivot - 1, target);  // Search left part
        }

    }


     // Function to find the pivot index (largest element)
     static int findPivot(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is the pivot
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > low && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Decide which half to search
            if (arr[low] >= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // No rotation found
    }

    // Standard Binary Search
    static int binarySearch(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        // reverseArrayInPlace(arr);
        // moveZeroToEnd(arr);
        System.out.println(findInRotatedArray(arr,0));
        // System.out.println(Arrays.toString(arr));
    }
}