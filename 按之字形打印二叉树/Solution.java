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

    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (pRoot == null) return ans;

        int h = 1;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(pRoot);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            ArrayList<Integer> tmp = new ArrayList<>();
            if ((h & 1) == 1) {
                while (!stack1.isEmpty()) {
                    TreeNode node = stack1.pop();
                    tmp.add(node.val);
                    if (node.left != null) stack2.push(node.left);
                    if (node.right != null) stack2.push(node.right);
                }
            } else {
                while (!stack2.isEmpty()) {
                    TreeNode node = stack2.pop();
                    tmp.add(node.val);
                    if (node.right != null) stack1.push(node.right);
                    if (node.left != null) stack1.push(node.left);
                }
            }
            h++;
            ans.add(tmp);
        }

        return ans;
    }

}
