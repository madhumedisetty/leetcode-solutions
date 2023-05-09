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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        
        if(n==size){
            head=head.next;
            return head;
        }
        
        ListNode prev=head;
        int x=0;
        while(x!=size-n-1){
            prev=prev.next;
            x++;
        }
        prev.next=prev.next.next;
        return head;
        
    }
}