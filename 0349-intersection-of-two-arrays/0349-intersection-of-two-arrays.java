class Solution {
   public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> freq = new HashMap<>();
        HashSet<Integer> intersect = new HashSet<>();
        
        for(int i : nums1){
            freq.put(i,freq.getOrDefault(i, 0)+1);
        }

        for(int i: nums2)
        {
            if(freq.containsKey(i)){    
                    intersect.add(i);
            }
        }
        
        return intersect.stream().mapToInt(Integer::intValue).toArray();
    }
}