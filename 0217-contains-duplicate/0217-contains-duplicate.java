import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int element : nums) {
            if (count.containsKey(element)) {
                return true;
            } else {
                count.put(element, 1);
            }
        }
        return false;
    }
}