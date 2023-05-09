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
        if(head==null ||head.next==null){
            return true;
            
        }
        
        //finding mid
        ListNode fast=head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        
        //reversing
        ListNode mid=slow.next;
        
        ListNode prev=null;
        while(mid!=null){
            ListNode n=mid.next;
            mid.next=prev;
            prev=mid;
            mid=n;
        }
        ListNode head2=prev;
        //comparing
        while(head2!=null){
            if(head.val!=head2.val)
                return false;
            head=head.next;
            head2=head2.next;
        }
        
        return true; 
    }
}


