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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        int before = -101; //not in the val range
        ListNode tempHead = head;
        ListNode prev = null;
        while(tempHead != null){
            if(tempHead.val != before){
                before = tempHead.val;
                prev = tempHead;
                tempHead = tempHead.next;
            }else{
                tempHead = tempHead.next;
                prev.next = tempHead;
            }
        }
        return head;
        
    }
}