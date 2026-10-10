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
        ListNode newNode = head;
        int c = 0;
        while(newNode!=null){
            newNode = newNode.next;
            c++;
        }
        if(n>c) return head;
        if(n==c) return head.next;
        if(c==1){
            head = null;
            return head;
        }
        ListNode temp = head;
        int i =0;
        ListNode prev = null;
        while(i != c - n){
            prev = temp;
            temp = temp.next;
            i++;
        }
        prev.next = temp.next;
        return head;
    }
}