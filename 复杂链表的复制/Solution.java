/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;

        //insert node
        RandomListNode tmp;
        RandomListNode head = pHead;
        while (head != null) {
            RandomListNode node = new RandomListNode(head.label);
            tmp = head.next;
            head.next = node;
            node.next = tmp;
            head = tmp;
        }

        //add random ptr
        head = pHead;
        while (head != null) {
            head.next.random = head.random == null ? null : head.random.next;
            head = head.next.next;
        }

        //delete cop node
        head = pHead;
        tmp = head.next;
        RandomListNode ans = head.next;
        while (head != null) {
            head.next = head.next.next;
            if (tmp.next != null) tmp.next = tmp.next.next;
            head = head.next;
            tmp = tmp.next;
        }

        return ans;
    }
}
