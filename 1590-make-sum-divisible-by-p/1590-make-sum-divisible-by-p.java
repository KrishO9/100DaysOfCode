import java.util.HashMap;

class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long totalSum = 0;
        
        for (int num : nums) {
            totalSum += num;
        }
        
        int remainder = (int) (totalSum % p);
        if (remainder == 0) return 0;
        
        // HashMap to store the last index of a particular prefix sum remainder
        HashMap<Integer, Integer> prefixRemainders = new HashMap<>();
        prefixRemainders.put(0, -1);
        
        int prefixSum = 0;
        int minLength = n;
        
        for (int i = 0; i < n; i++) {
            prefixSum = (prefixSum + nums[i]) % p;
            
            int target = (prefixSum - remainder + p) % p;
            
            if (prefixRemainders.containsKey(target)) {
                minLength = Math.min(minLength, i - prefixRemainders.get(target));
            }
            
            prefixRemainders.put(prefixSum, i);
        }
        return minLength == n ? -1 : minLength;
    }
}
