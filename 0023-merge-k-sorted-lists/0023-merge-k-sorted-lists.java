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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for(ListNode node: lists) {
            while(node != null) {
                pq.offer(node);
                node = node.next;
            }
        }
        if(pq.isEmpty())
            return null;

        ListNode result = new ListNode(0);
        ListNode temp = result;
        while(!pq.isEmpty()) {
            temp.next = pq.poll();
            temp = temp.next;
        }
        temp.next = null;
        return result.next;
    }
}