public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int res = array[0];
        int max = res;
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max + array[i], array[i]);
            res = Math.max(max, res);
        }

        return res;
    }
}
