class ListNode{
    int value;
    ListNode next;
    public ListNode(int value){
        this.value = value;
        this.next = null;
    }
}
class MyLinkedList {
    ListNode head;
    public MyLinkedList() {
        this.head = null;
    }
    
    public int get(int index) {
    ListNode curr = head;
    while (curr != null && index > 0) {
        curr = curr.next;
        index--;
    }
    if (curr == null) return -1;
    return curr.value;
}
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    
    public void addAtIndex(int index, int val) {
    if (index == 0) {
        addAtHead(val);
        return;
    }

    ListNode curr = head;
    ListNode prev = null;
    while (curr != null && index > 0) {
        prev = curr;
        curr = curr.next;
        index--;
    }

    if (index == 0 && prev != null) {
        ListNode newNode = new ListNode(val);
        prev.next = newNode;
        newNode.next = curr;
    }
}

    
   public void deleteAtIndex(int index) {
    if (head == null) {
        return;
    }

    if (index == 0) {
        head = head.next;
        return;
    }

    ListNode curr = head;
    ListNode prevNode = null;

    while (curr != null && index > 0) {
        prevNode = curr;
        curr = curr.next;
        index--;
    }

    if (curr != null && prevNode != null) {
        prevNode.next = curr.next;
    }
}

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
