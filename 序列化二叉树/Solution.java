import java.util.*;
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
    String Serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);

        return sb.delete(sb.length() - 1, sb.length()).toString();
    }

    TreeNode Deserialize(String str) {
       if (str.length() == 0) return null;

        String[] nodes = str.split("!");

        return buildTree(nodes, new int[1]);
    }

    private void buildString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("#").append("!");
            return;
        }

        sb.append(node.val).append("!");
        buildString(node.left, sb);
        buildString(node.right, sb);
    }

    private TreeNode buildTree(String[] nodes, int[] index) {
        if (nodes.length == index[0]) return null;
        String node = nodes[index[0]];
        index[0]++;
        if ("#".equals(node)) return null;

        TreeNode root = new TreeNode(Integer.valueOf(node));
        root.left = buildTree(nodes, index);
        root.right = buildTree(nodes, index);

        return root;
    }
}
