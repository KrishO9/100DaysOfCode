class Solution {
    public int longestPalindrome(String s) {
     int Longestl = 0;
        int flag = 0;
        Map <Character,Integer> count = new HashMap<>();
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (int freq : count.values()) {
            if(freq%2==0)
            {
                Longestl += freq;
            }
            else{
                Longestl += freq - 1;
                flag = 1;
            }
        }
        if(flag==1) Longestl++;
        return Longestl;
    }
}