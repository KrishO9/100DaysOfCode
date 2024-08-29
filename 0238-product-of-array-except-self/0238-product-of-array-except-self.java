class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1; 
        int count = 0;
        int [] answer = new int[nums.length];
       for(int i =0;i<nums.length;i++)
       {
           
           if(nums[i]==0) count++;  
           else{
               prod *= nums[i];
           }
       }
        
        //prod = 9
        //count =1
        
        for(int j=0;j<nums.length;j++)
        {
           if(count>=2) return answer;
            
           else if(count==1) {
               if(nums[j]==0) nums[j] = prod;
               else {
                   nums[j] = 0;
               }
           }
            else{
                nums[j] = prod/nums[j];
            }   
        }   
        return nums;
    }
                
}
