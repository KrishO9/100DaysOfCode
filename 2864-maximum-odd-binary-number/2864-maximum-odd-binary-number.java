class Solution {
   /* public String maximumOddBinaryNumber(String s) {
        int i = s.length()-1;
        int count = 0;
        while(i>=0)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
            i--;
        }
        StringBuilder sb = new StringBuilder("");
        for(int j =0;j<s.length()-count;j++)
        {
            sb.append('0');
        }
        while(count>0){
            if(count==1){
                sb.append('1');
                count--;
            }
            else{
                sb.insert(0,'1');
                count--;
            }
        }
        return sb.toString();
        
    } */
    
     public String maximumOddBinaryNumber(String s) {
        int i = s.length()-1;
        int count1 = 0;
        int count0 = 0;
        while(i>=0)
        {
            if(s.charAt(i)=='1')
            {
                count1++;
            }
            else{
                count0++;
            }
            i--;
        }
        StringBuilder sb = new StringBuilder("");
        sb.append("1".repeat(count1-1));
        sb.append("0".repeat(count0));
        sb.append("1");
        
        return sb.toString();
        
    }
}