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
    public ListNode reverse(ListNode head){
        ListNode curr =head;
        ListNode prev = null;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = null;
        ListNode head = null;
        ListNode tail = null;
        // l1 = reverse(l1);
        // l2 = reverse(l2);
        int carry = 0;
        while(l1!=null || l2!=null){
            int sum = carry;
            if(l1!=null){
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum = sum + l2.val;
                l2 = l2.next;
            }

            int rem = sum%10;
            carry = sum/10;
            l = new ListNode(rem);
            if(head == null){
                head = l;
                tail = l;
            }else{
                tail.next = l;
                tail = l;
            }
            
        }
        if(carry>0){
                l = new ListNode(carry);
                tail.next = l;
                tail = l;
            }
        return head;
    }
}