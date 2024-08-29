import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        List<Integer> [] buckets = new List[nums.length+1];  
        for(int i : nums)
        {
            freq.put(i,freq.getOrDefault(i,0)+1);
        }

       
        for(int i : freq.keySet())
        {
            int f = freq.get(i);
            if(buckets[f]==null)
            {
                buckets[f] = new ArrayList<>();
            }
            buckets[f].add(i);
        }

        int [] results = new int[k];
        int j =0;
        for(int i = buckets.length-1 ; i>0 && j<k ; i--)
        {
            if(buckets[i]!=null)
            {
                for(int x : buckets[i])
                {
                    results[j] = x;
                    j++;
                }
            }
        }
        return results;
    }
}