class Solution {
public boolean checkInclusion(String s1, String s2) {
            int n1 = s1.length();
            int n2 = s2.length();

            if (n1 > n2) return false;
    
            HashMap<Character, Integer> freqS1 = new HashMap<>();
            for (char c : s1.toCharArray()) {
                freqS1.put(c, freqS1.getOrDefault(c, 0) + 1);
            }
            for (int i = 0; i <= n2 - n1; i++) {
                String subStr = s2.substring(i, i + n1);
                HashMap<Character, Integer> freqSubStr = new HashMap<>();
                for (char c : subStr.toCharArray()) {
                    freqSubStr.put(c, freqSubStr.getOrDefault(c, 0) + 1);
                }
                if (freqS1.equals(freqSubStr)) {
                    return true;
                }
            }
            return false;
        }
}