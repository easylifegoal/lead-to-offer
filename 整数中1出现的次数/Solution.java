public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int div = i * 10;
            int mod = n % div;
            int k = 0;
            if (mod > i * 2 - 1) {
                k = i;
            } else if (mod >= i) {
                k = mod - i + 1;
            }

            count += n / div * i + k;
        }

        return count;
    }
}
