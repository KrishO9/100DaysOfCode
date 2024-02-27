import java.util.Arrays;
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int currentpairsum = 0;
        int maxpairsum = nums[0];
        int l =0,r=nums.length-1;
        while(l<r){
            currentpairsum = nums[l]+nums[r];
            if(currentpairsum>maxpairsum) maxpairsum = currentpairsum;
            l++;
            r--;
        }
        return maxpairsum;
    }
}