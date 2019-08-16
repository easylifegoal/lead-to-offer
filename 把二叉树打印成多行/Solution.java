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
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        List<List<Integer>> ans = new ArrayList<>();

        if (pRoot == null) return (ArrayList)ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> tmp = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            ans.add(tmp);
        }

        return (ArrayList)ans;
    }

}
