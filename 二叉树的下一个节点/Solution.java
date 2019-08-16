/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) return null;

        TreeLinkNode ans = null;
        if (pNode.right != null) {
            TreeLinkNode cur = pNode.right;

            while (cur.left != null) {
                cur = cur.left;
            }

            ans = cur;
        } else if (pNode.next != null) {
            TreeLinkNode cur = pNode;
            TreeLinkNode p = pNode.next;

            while (p != null && p.right == cur) {
                cur = cur.next;
                p = cur.next;
            }

            ans = p;
        }

        return ans;
    }
}
