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
    public boolean isPalindrome(ListNode head){
        if (head == null || head.next == null) 
            return true;
        if(head.next.next==null){
            if(head.val==head.next.val){
                return true;
            }
            else{
                return false;
            }
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        if (fast != null) {
            slow = slow.next;
        }

        ListNode prev = null;
        ListNode t;

        while(slow!=null)
        {
            t = slow.next;
            slow.next = prev;
            prev = slow;
            slow = t;

        }
        while(prev!=null){
            if(head.val!=prev.val){
               return false;
            }
            else{
                head = head.next;
                prev = prev.next;
            }
        }
        return true;
    }
}