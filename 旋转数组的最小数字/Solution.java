import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) return 0;

        int l = 0;
        int r = array.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (array[mid] >= array[r]) {
                if (mid == array.length - 1) return array[mid];
                l = mid + 1;
            } else {
                if (mid == 0 || array[mid - 1] > array[mid]) return array[mid];
                r = mid - 1;
            }
        }

        return array[r];
    }
}
