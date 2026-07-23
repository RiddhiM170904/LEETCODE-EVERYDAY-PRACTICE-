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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;//list1 ka head define kia
        ListNode head2 = list2;//list2 kaa head define kiya
        ListNode n = new ListNode(0); // new ll define kii
        ListNode curr = n;//uska head define kiyaa
        while(head1!=null && head2!=null){//jab tk dono me se ek null nhi ho jata 
            if(head1.val<=head2.val){//jiski value choti 
                curr.next = new ListNode(head1.val);//usko add krr diya naye wal mein
                head1 = head1.next;//head1 update
            }else{
                curr.next = new ListNode(head2.val);
                head2 = head2.next;//head2 update
            }
            curr = curr.next;//curr ke next ko point kara diya
        }
        if(head1==null){
            curr.next = head2;//agr head1 null ho gyaa tohh directly jump to head2 
        }
        if(head2==null){
            curr.next = head1;//agr head2 null ho gyaa tohh directly jump to head1 
        }
        return n.next;//return krwaa do puri LL
    }
}