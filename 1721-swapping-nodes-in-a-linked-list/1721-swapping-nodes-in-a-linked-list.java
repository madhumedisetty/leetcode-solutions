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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr=head;
        ListNode s=null,e=null;
        int i=1;
        while(i++<k)
            curr=curr.next;
        s=curr;
        e=head;
        while(curr.next!=null){
            curr=curr.next;
            e=e.next;
        }
        
        int temp=s.val;
        s.val=e.val;
        e.val=temp;
        return head;     
    }
}