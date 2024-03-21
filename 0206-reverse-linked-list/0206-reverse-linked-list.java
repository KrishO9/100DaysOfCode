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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next; // Save the next node
            current.next = prev; // Reverse the link
            prev = current; // Move one step forward in the list
            current = nextNode; // Move one step forward in the list
        }

        return prev; // 'prev' is the new head of the reversed list
    }
}
