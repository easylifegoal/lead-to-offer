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
    TreeNode last = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;

        helper(pRootOfTree);

        while (pRootOfTree.left != null) {
            pRootOfTree = pRootOfTree.left;
        }

        return pRootOfTree;
    }

    private void helper (TreeNode root) {
        if (root == null) return;

        helper(root.left);

        root.left = last;
        if (last != null) last.right = root;

        last = root;
        helper(root.right);
    }
}
