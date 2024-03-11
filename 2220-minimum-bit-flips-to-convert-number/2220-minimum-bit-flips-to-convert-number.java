class Solution {
   public int minBitFlips(int start, int goal) {
        int count =0;
        int diff = start ^ goal;

        for(int i =0;i<32;i++)
        {
            if((diff & (1<<i))==Math.pow(2,i)){
                count++;
            }
        }
        
        return count;
    }
}