import java.util.*;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (size == 0 || num.length < size) return ans;

        int[] right = new int[num.length];
        int[] left = new int[num.length];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (i % size == 0) max = Integer.MIN_VALUE;
            max = Math.max(max, num[i]);
            right[i] = max;
        }

        max = Integer.MIN_VALUE;
        for (int i = num.length - 1; i >= 0; i--) {
            if ((i + 1) % size == 0) max = Integer.MIN_VALUE;
            max = Math.max(max, num[i]);
            left[i] = max;
        }

        for (int i = 0; i < num.length - size + 1; i++) {
            ans.add(Math.max(left[i], right[i + size - 1]));
        }

        return ans;
    }
}
