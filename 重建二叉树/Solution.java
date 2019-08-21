/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int preIndex;
    int inIndex;

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return build(pre, in, null);
    }

    private TreeNode build(int[] pre, int[] in, TreeNode last) {
        if (preIndex == pre.length
                || (last != null && last.val == in[inIndex])) {
            return null;
        }

        TreeNode node = new TreeNode(pre[preIndex]);

        preIndex++;
        node.left = build(pre, in, node);

        inIndex++;
        node.right = build(pre, in, last);

        return node;
    }
}
