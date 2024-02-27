class Solution {
     public double findMaxAverage(int[] nums, int k) {
        int currentSum =0;
        double currentAvg =0.0;

    if(nums.length==1&&k==1) return (double)nums[0];
        
    for(int i =0;i<k;i++)
         {
            currentSum += nums[i];
         }
         currentAvg = (double)currentSum/k;

         for(int i =0;i<nums.length-k;i++)
        {
            currentSum = currentSum - nums[i];
            currentSum = currentSum + nums[i+k];
            if((double)currentSum/k > currentAvg) currentAvg = (double)currentSum/k;
        }
return currentAvg;
        }
}