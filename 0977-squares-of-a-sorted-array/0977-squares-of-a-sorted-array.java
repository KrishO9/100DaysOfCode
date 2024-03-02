class Solution {
       public int[] sortedSquares(int[] nums) {
        int left =0;
        int right = nums.length-1;
        int index = nums.length-1;
        int[] result = new int[nums.length];
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                result[index] = (int) Math.pow(nums[left], 2);
                left++;
            }
            else{
                result[index] = (int) Math.pow(nums[right], 2);
                right--;
            }
            index--;

        }
        return result;
    }
}