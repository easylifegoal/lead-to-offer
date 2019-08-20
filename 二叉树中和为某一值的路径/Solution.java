import java.util.*;
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
      public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        helper(list, path, root, target, 0);
        list.sort(new Comparator<ArrayList>() {
            @Override
            public int compare(ArrayList o1, ArrayList o2) {

                return o2.size() - o1.size();
            }
        });

        return list;
    }

    private void helper(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> path,
                        TreeNode root, int target, int sum) {
        if (root == null) return;

        sum += root.val;
        path.add(root.val);

        if (root.left == null && root.right == null) {
            if (sum == target) {
                list.add(new ArrayList<>(path));
            }
            path.remove(path.size() - 1);
            return;
        }

        helper(list, path, root.left, target, sum);
        helper(list, path, root.right, target, sum);

        path.remove(path.size() - 1);
    }
}
