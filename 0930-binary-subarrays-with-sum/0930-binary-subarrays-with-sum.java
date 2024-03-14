import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();
        int prefixSum = 0;

        for (int num : nums) {
            prefixSum += num;
            count += sumMap.getOrDefault(prefixSum - goal, 0);
            if (prefixSum == goal) {
                count++; // Increment count if the current prefix sum is equal to the goal
            }
            sumMap.put(prefixSum, sumMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
