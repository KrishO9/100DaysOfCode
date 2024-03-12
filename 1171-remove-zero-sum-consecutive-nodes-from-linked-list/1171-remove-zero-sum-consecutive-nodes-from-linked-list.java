/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
   public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;  // Start from the dummy node
        int prefixSum = 0;
        HashMap<Integer, ListNode> map = new HashMap<>();

        while (temp != null) {
            prefixSum += temp.val;

            if (map.containsKey(prefixSum)) {
                temp = map.get(prefixSum).next;
                int sum = prefixSum + temp.val;
                while (sum != prefixSum) {
                    map.remove(sum);
                    temp = temp.next;
                    sum += temp.val;
                }

                map.get(prefixSum).next = temp.next;
            } else {
                map.put(prefixSum, temp);
            }

            temp = temp.next;
        }

        return dummy.next;
    }
}