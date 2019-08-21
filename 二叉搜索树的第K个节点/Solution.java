/*
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
    TreeNode ans;
    int sum = 0;
    TreeNode KthNode(TreeNode pRoot, int k) {
        helper(pRoot, k);

        return ans;
    }

    private void helper(TreeNode root, int k) {
        if (ans != null || root == null) return;

        helper(root.left, k);
        sum++;
        if (sum == k) {
            ans = root;
            return;
        }
        helper(root.right, k);
    }

}
