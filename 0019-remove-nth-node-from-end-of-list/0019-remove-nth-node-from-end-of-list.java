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
   public ListNode removeNthFromEnd(ListNode head, int n) 
 {
    int size =1;
    int i =1;
    ListNode temp1 = head;
    while(temp1.next!=null)
    {
        temp1 = temp1.next;
        size++;
    } 
     temp1 = head;
    ListNode temp2 = head.next;

   if(n==size)
   {
    if(size==1)
    {
        return null;
    }
    else{
        head = head.next;
        temp1.next = null;
        return head;  
        }
   } 
   
    while(i<size-n){
        temp1 = temp1.next;
        temp2 = temp2.next;
        i++;
    }
    temp1.next = temp2.next;
    temp2.next = null;
    return head;  

  }
}