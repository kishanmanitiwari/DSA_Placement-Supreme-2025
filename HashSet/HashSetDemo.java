package DSA.HashSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class HashSetDomo{

    //add - contains - size - remove

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        
        for (int  num : nums) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }

        return true;
    }

    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        //Step number 1 I will add elements in the set
        //Agar mujhe tera partner dikh gya to you are out of the set

        for (int num : nums) {
         
            
          if (set.contains(num)) {
              set.remove(num);
          } else {
                set.add(num);
          }
        }

        for(int num:set){
            return num;
        }

       
        
        return -1;
      
    }

    public static  int[] twoSum(int[] nums, int target) {
        // // [2,7,11,15]
        //   int n = nums.length;
        //   for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        //   }
          
        //   return new int[]{};

        //Step 1: Make Value - Index map
        //Step 2 : Calculat the compliment (diffrence)
        //Step 3: Agar diff map mein hai to current index aur complement ka index return
        //step 4: No pair possoblre return {};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int compliment = target - nums[i];

            if (map.containsKey(compliment)) {
                int[] arr = new int[2];
                arr[0] = i;
                arr[1] = map.get(compliment); //get the index at the compliment
            }


            map.put(nums[i],i);
        }
        
        return new int[]{};


    }

    public static void main(String[] args) {
        int nums[] = {2,11,15,7};

        
        //System.out.println(containsDuplicate(nums));


        //System.out.println(singleNumber(nums));

        System.out.println(Arrays.toString(twoSum(nums,9)));
    }
}