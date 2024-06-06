import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
    if(hand.length % groupSize !=0)
        {
            return false;
        }
        if(groupSize==0 || groupSize==1)
        {
            return true;
        }
        Map<Integer, Integer> count = new HashMap<>();
        for (int card : hand) {
            count.put(card, count.getOrDefault(card, 0) + 1);
        }
        
        Arrays.sort(hand);
            for (int i = 0; i < hand.length; i++) {
            if (count.get(hand[i]) == 0) {
                continue;
            }
            
            for (int j = 0; j < groupSize; j++) {
                int currCard = hand[i] + j;
                
                if (count.getOrDefault(currCard, 0) == 0) {
                    return false;
                }
                
                count.put(currCard, count.get(currCard) - 1);
            }
        }
        
        return true;
        }
        
        
    
        
        
    }
