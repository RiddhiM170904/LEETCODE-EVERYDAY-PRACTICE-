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
        int carry = 0; // carry over krne liye
        ListNode head1 = l1;//head1 define kia
        ListNode head2 = l2;//head2 define kiya
        ListNode n = new ListNode(0); // nayi ll banayi for storing answer
        ListNode curr = n;//uss ll ka head define kiya
        
        while(head1 != null || head2 != null){//jab tk dono ke head null nhi ho jate h 
            int sum =carry;//sum ko carry kii value assign kii
            if(head1!=null){
                sum += head1.val;//add krne ka part
                head1 = head1.next;//next

            }if(head2 != null){
                sum += head2.val;//add ka part
                head2 = head2.next; // next
            }
            curr.next = new ListNode(sum%10);//final node mein add krne wali value nikali 
            curr = curr.next;//next
            carry = sum/10;//carry nikala
        }
        if (carry != 0) {
            curr.next = new ListNode(carry);//agar sb khtm hone ke baad carry bachta h tohh next node pr laga dena
        }
        return n.next;// final ll print krwa diya 

    }
}