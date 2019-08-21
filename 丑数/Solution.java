public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index == 0) return 0;

        int[] ugly = new int[index];
        ugly[0] = 1;
        int index2 = 1, index3 = 1, index5 = 1;
        int factor2 = 2, factor3 = 3, factor5 = 5;

        for (int i = 1; i < index; i++) {
            int min = Math.min(Math.min(factor2, factor3), factor5);
            ugly[i] = min;
            if (min == factor2) factor2 = 2 * ugly[index2++];
            if (min == factor3) factor3 = 3 * ugly[index3++];
            if (min == factor5) factor5 = 5 * ugly[index5++];
        }

        return ugly[index - 1];
    }
}
