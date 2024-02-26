public class Solution {

    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        s = s.trim();
        
        String[] words = s.split("\\s+");
        for(int i = words.length - 1; i >= 0; i--){
            if(!words[i].equals("")) {
                result.append(words[i]).append(" ");
            }
        }
        
        return result.toString().trim();
    }
    
}