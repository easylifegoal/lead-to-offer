import java.util.*;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (k == 0 || input.length < k) return ans;

        sort(input, 0, input.length - 1, k);
        for (int i = 0; i < k; i++) {
            ans.add(input[i]);
        }

        return ans;
    }

    private void sort(int[] nums, int l, int r, int k) {
        if (l >= r) return;

        int i = partition(nums, l, r);
        if (k - 1 == i) return;
        else if (k - 1 > i) sort(nums, i + 1, r, k);
        else sort(nums, l, i - 1, k);
    }

    private int partition(int[] nums, int l, int r) {
        int pivot = nums[r];
        int swap = l;
        int index = l;
        while (index <= r) {
            if (nums[index] < pivot) {
                int tmp = nums[index];
                nums[index] = nums[swap];
                nums[swap]= tmp;
                swap++;
            }
            index++;
        }
        nums[r] = nums[swap];
        nums[swap] = pivot;

        return swap;
    }
}
