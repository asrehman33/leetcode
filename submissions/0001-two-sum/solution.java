import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // O(n^2)
        // int lenTab = nums.length;
        // for (int i = 0; i < lenTab; i++){
        //     int current = nums[i];
        //     for (int j = i+1; j < lenTab; j++){
        //         if (current + nums[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if (map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }


        throw new IllegalArgumentException("No Solution !");
    }
}
