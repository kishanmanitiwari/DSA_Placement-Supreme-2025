

class PracticeSession{

    static void reverseArrayInPlace(int[] arr){
        int start = 0; int end = arr.length-1;

        while (start<end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int arr[],int x , int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static void moveZeroToEnd(int[] arr){
        int j = 0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                //non-zero element
                swap(arr,i,j);
                j++;
            }
        }
    }

    static int printAllSubarr(int[] arr){
        int n = arr.length; 
        int maxi = 0;

        for(int i=0;i<n;i++){
            int tempSum = 0;
            for(int j=i;j<n;j++){
                tempSum+=arr[j];
               if(tempSum>maxi){
                maxi = tempSum;
            }
                
              
            }
        }
        
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] =  {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //reverseArrayInPlace(arr);
       // moveZeroToEnd(arr);
        System.out.println(printAllSubarr(arr));
        //System.out.println(Arrays.toString(arr));
    }
}