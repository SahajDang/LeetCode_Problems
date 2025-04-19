// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        int size = 0;
        ListNode temp = head;

        // 1. Calculate length
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (k > size) return head;
        if (2 * k - 1 == size) return head;

        // 2. Find k-th node from beginning
        ListNode prev1 = null, node1 = head;
        int i = 1;
        while (i < k) {
            prev1 = node1;
            node1 = node1.next;
            i++;
        }

        // 3. Find k-th node from end (size - k + 1)
        ListNode prev2 = null, node2 = head;
        int j = 1;
        while (j < size - k + 1) {
            prev2 = node2;
            node2 = node2.next;
            j++;
        }

        // 4. Adjust previous pointers
        if (prev1 != null) prev1.next = node2;
        else head = node2;

        if (prev2 != null) prev2.next = node1;
        else head = node1;

        // 5. Swap next pointers
        ListNode tempNext = node1.next;
        node1.next = node2.next;
        node2.next = tempNext;

        return head;
    }
}
