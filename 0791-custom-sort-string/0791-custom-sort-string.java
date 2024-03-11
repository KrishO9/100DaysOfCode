class Solution {
     public String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        } 
        for(char c : order.toCharArray())
        {
            if(map.containsKey(c)){
                int freq = map.get(c);
                while (freq-- > 0) {
                    res.append(c);
                }
                map.put(c, 0);     
            }
        }
        for (char ch : s.toCharArray()) {
            if (map.get(ch) != 0) {
                res.append(ch);
                map.put(ch, map.get(ch) - 1);
            }
        }
        return res.toString();
    }
}