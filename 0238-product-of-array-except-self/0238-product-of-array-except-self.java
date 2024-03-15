class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] answer = new int[nums.length];
        // for(int i =0;i<nums.length;i++){
        //     answer[i] = 1;
        //     for(int j=0;j<nums.length;j++)
        //     {
        //        if(nums[i]==0 && j==i)
        //        {
        //             continue;
        //        }
        //        else{
        //         answer[i] *= nums[j];
        //        }
        //     }
        //    if(nums[i]!=0)
        //     { answer[i] /= nums[i];}
        // }
        // return answer;

        int n=nums.length;
        int product=1,countzeros=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                countzeros++;
                continue;
            }
            product*=nums[i];
        }
        if(countzeros>1) product =0;

        for(int j =0;j<n;j++)
        {
            if(nums[j]==0) nums[j] = product;
            else if(countzeros==0) nums[j] = product/nums[j];
            else nums[j] =0;
        }
        return nums;
    }
}