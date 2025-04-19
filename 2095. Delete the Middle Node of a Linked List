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
    public ListNode deleteMiddle(ListNode head) {

        ListNode curr = head;
        int size = 0;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        int index = (int) Math.floor(size / 2);

        if (head == null) {
        return null;
        }

        if(index == 0){
            head = head.next;
            return head;
        }

        ListNode prev = null;
        ListNode cur = head;

        while(cur != null && index > 0){
            prev = cur;
            cur = cur.next;
            index--;
        }

        if(cur != null && prev !=null){
            prev.next = cur.next;
        }

        return head;
    }
}
