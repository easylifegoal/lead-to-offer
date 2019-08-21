public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (helper(matrix, i, j, str, 0, rows, cols)) return true;
            }
        }

        return false;
    }

    private boolean helper(char[] matrix, int i, int j, char[] str, int index,
                          int rows, int cols) {
        if (index == str.length) return true;
        if (i < 0 || i == rows || j < 0 || j == cols
               || matrix[i * cols + j] != str[index]) {
            return false;
        }

        matrix[i * cols + j] ^= 256;
        index++;
        boolean exit = helper(matrix, i + 1, j, str, index, rows, cols)
                    || helper(matrix, i - 1, j, str, index, rows, cols)
                    || helper(matrix, i, j + 1, str, index, rows, cols)
                    || helper(matrix, i, j - 1, str, index, rows, cols);
        matrix[i * cols + j] ^= 256;

        return exit;
    }


}
