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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode l3 = dummyHead;
        
        int carry = 0;
        
        while(l1 != null || l2 != null) {
            int l1Val = (l1 != null) ? l1.val : 0; //these are ternary conditions
            int l2Val = (l2 != null) ? l2.val : 0; //what this says is that if l2 or l1 is not null than use the value stored in the node (l1/l2.val) else it would use 0
            
            int curr_sum = l1Val + l2Val + carry;
            carry = curr_sum / 10;
            int lastDigit = curr_sum % 10;
            
            ListNode newnode = new ListNode(lastDigit);
            l3.next = newnode;
            
            if(l1.next != null) l1 = l1.next;
            if(l2.next != null) l2 = l2.next;
            l3 = l3.next;
        }
        
        //if carry is greater than 0
        if(carry > 0) {
            ListNode newnode = new ListNode(carry);
            l3.next = newnode;
            l3 = l3.next;
        }
        
        return dummyHead;
            
    }
    
}
