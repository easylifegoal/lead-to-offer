/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode temp, tail;
        tail = null;
        while(head.next != null) {
            temp = head;
            head = head.next;
            temp.next = tail;
            tail = temp;
        }
        head.next = tail;
        return head;
    }
}
