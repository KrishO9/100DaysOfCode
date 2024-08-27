import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> elements = new HashMap<>();
        int [] index = new int[2];
        
        for(int i=0;i<nums.length;i++)
        {
            if(elements.containsKey(target-nums[i]))
            {
                index[0] = elements.get(target-nums[i]);
                index[1] = i;
                return index;
            }
             elements.put(nums[i],i);
        }
        return new int[] {}; 
    }
}