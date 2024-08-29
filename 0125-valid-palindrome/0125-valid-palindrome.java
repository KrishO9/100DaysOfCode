class Solution {
       public boolean isPalindrome(String s) {
        if(s.equals("")) return true;
        String converted = "";
        for(int i=0;i<s.length();i++)
        {
            if(isAlphaNumeric(s.charAt(i)))
            {
                converted += String.valueOf(s.charAt(i)).toLowerCase();
            }
        }
        System.out.println(converted);
        int first = 0;
        int last = converted.length()-1;
        while(first<last)
        {
            if(converted.charAt(first)!=converted.charAt(last)) return false;
            first++;
            last--;
        }
        return true;
    }
    
    public boolean isAlphaNumeric(char ch)
    {
        if(ch>='a' && ch<='z')
            return true;
        else if(ch>='A' && ch<='Z')
            return true;
        else if(ch>='0'&& ch<='9')
            return true;
        else
        {
            return false;
        }
}
}
