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
        ListNode temp = head;
        int k =0;
        while(temp!=null){
            k++;
            temp = temp.next;
            
        }
        if(k==n){
            return head.next;
        }
        int rem = k - n;
        ListNode curr = head;
        ListNode prev = null;
        while(rem!=0){
            prev = curr;
            curr = curr.next;
            rem--;
        }
        prev.next = curr.next;
        return head;
    }
}