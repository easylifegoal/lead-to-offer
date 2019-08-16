import java.util.*;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        List<int[]> tmp = new ArrayList<>();
        int[] min = new int[2];
        List<Integer> ans = new ArrayList<>();

        int l = 0;
        int r = array.length - 1;

        while (l < r) {
            int res = array[l] + array[r];
            if (res > sum) {
                r--;
            } else if (res < sum) {
                l++;
            } else {
                tmp.add(new int[]{array[l], array[r]});
                r--;
                l++;
            }
        }

        if (tmp.size() == 0) return (ArrayList) ans;
        min[0] = tmp.get(0)[0];
        min[1] = tmp.get(0)[1];

        for (int[] nums : tmp) {
            if (nums[0] * nums[1] < min[0] * min[1]) {
                min[0] = nums[0];
                min[1] = nums[1];
            }
        }

        ans.add(min[0]);
        ans.add(min[1]);

        return (ArrayList) ans;
    }
}
