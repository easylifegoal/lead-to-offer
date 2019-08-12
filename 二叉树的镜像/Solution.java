/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public void Mirror(TreeNode root) {
        if (root == null) return;

        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;

        Mirror(root.left);
        Mirror(root.right);
    }
}
