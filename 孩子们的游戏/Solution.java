import java.util.*;

public class Solution {
    class Node {
        int index;
        Node next;

        public Node(int index) {
            this.index = index;
        }
    }

    public int LastRemaining_Solution(int n, int m) {
        if (n == 0) return -1;

        Node head = new Node(0);
        Node cur = head;

        for (int i = 1; i < n; i++) {
            cur.next = new Node(i);
            cur = cur.next;
        }
        cur.next = head;

        while (head != head.next) {

            for (int i = 0; i < m - 2; i++) {
                head = head.next;
            }

            head.next = head.next.next;
            head = head.next;
        }

        return head.index;
    }
}
