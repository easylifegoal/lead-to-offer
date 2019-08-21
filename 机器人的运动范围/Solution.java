public class Solution {
    public int movingCount(int threshold, int rows, int cols) {
        int[] ans = new int[1];
        int[] visited = new int[rows * cols];
        helper(threshold, rows, cols, 0, 0, visited, ans);

        return ans[0];
    }

    private void helper(int k, int rows, int cols, int i, int j,
                        int[] visited, int[] ans) {
        if (i < 0 || i == rows || j < 0 || j == cols
               || visited[i * cols + j] == 1) {
            return;
        }
        if (!isOK(i, j, k)) return;

        ans[0]++;
        visited[i * cols + j] = 1;

        helper(k, rows, cols, i + 1, j, visited, ans);
        helper(k, rows, cols, i - 1, j, visited, ans);
        helper(k, rows, cols, i, j + 1, visited, ans);
        helper(k, rows, cols, i, j - 1, visited, ans);

    }

    private boolean isOK(int i, int j, int k) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i = i / 10;
        }
        while (j != 0) {
            sum += j % 10;
            j = j / 10;
        }
        if (sum <= k) return true;

        return false;
    }
}
