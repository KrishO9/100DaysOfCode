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
   public int lengthOflist(ListNode head){
        int len=0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;}
            return len;
    }
    public ListNode middleNode(ListNode head) {
        int middle = lengthOflist(head)/2 +1;
        while(middle>1 && head != null) {
            head = head.next;
            middle--;
        }
        return head;
}}