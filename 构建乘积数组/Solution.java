import java.util.*;

public class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        int res = 1;
        //left to right
        B[0] = 1;
        for (int i = 1; i < A.length; i++) {
            res *= A[i - 1];
            B[i] = res;
        }

        //rigth to left
        res = 1;
        for (int i = A.length - 2; i >= 0; i--) {
            res *= A[i + 1];
            B[i] *= res;
        }

        return B;
    }
}
