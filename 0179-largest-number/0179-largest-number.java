import java.util.Comparator;
import java.util.Arrays;
class Solution {
    public String largestNumber(int[] nums) {
        String s[] = new String[nums.length];
        String max = "";
        for(int i=0;i<nums.length;i++)
        {
            s[i] = String.valueOf(nums[i]);
        }
  
       
        Comparator <String> comp = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                String s1 = str1+str2;
                String s2 = str2+str1;
        
                return s2.compareTo(s1);
            }
          };

          Arrays.sort(s,comp);

          if(s[0].charAt(0) == '0')
			return "0"; //all are zeroes


          for(String str :s){
            max +=str;
          }

          return max;

    }
}