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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;

        while (size >= k) {
            ListNode curr = prevGroupEnd.next;
            ListNode next = curr.next;

            for (int i = 1; i < k; i++) {
                curr.next = next.next;
                next.next = prevGroupEnd.next;
                prevGroupEnd.next = next;
                next = curr.next;
            }

            // Move prevGroupEnd to the end of the reversed group
            prevGroupEnd = curr;
            size -= k;
        }

        return dummy.next;
    }
}
