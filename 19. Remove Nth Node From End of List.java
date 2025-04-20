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
        if (head == null || head.next == null) {
            return null;
        }
        ListNode prev = null;
        ListNode curr = head;
        int size = 0;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }

        int node = size - n;
        ListNode cur = head;
        while(cur != null && node > 0){
            prev = cur;
            cur = cur.next;
            node--;
        }
        if(cur != null && prev != null){
            prev.next = cur.next;
        }
        return head;
    }
}
