class Solution {
    public boolean isSubsequence(String s, String t) {
       int i =0 ; 
        int j =0 ; 
        while(j<s.length() && i < t.length()){
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
            i++;
        }

        return j == s.length() ; 
    }
}