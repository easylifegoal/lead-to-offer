public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0) return false;

        return helper(sequence, 0, sequence.length - 1);
    }

    private boolean helper(int[] sequence, int l, int r) {
        if (l >= r) return true;

        int pos = l;
        while (pos < r && sequence[pos] < sequence[r]) {
            pos++;
        }
        int mid = pos;
        while (pos < r && sequence[pos] > sequence[r]) {
            pos++;
        }
        if (pos != r) return false;

        return helper(sequence, l, mid - 1) && helper(sequence, mid, r - 1);
    }
}
