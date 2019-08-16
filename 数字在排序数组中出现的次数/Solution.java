public class Solution {
    public int GetNumberOfK(int [] array , int k) {
       //min
        int l = 0;
        int r = array.length - 1;
        int min = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (array[mid] > k) {
                r = mid - 1;
            } else if (array[mid] < k) {
                l = mid + 1;
            } else {
                if (mid == 0 || array[mid - 1] < k) min = mid;
                r = mid - 1;
            }
        }

        if (min == -1) return 0;

        l = 0;
        r = array.length - 1;
        int max = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (array[mid] > k) {
                r = mid - 1;
            } else if (array[mid] < k) {
                l = mid + 1;
            } else {
                if (mid == array.length - 1 || array[mid + 1] > k) max = mid;
                l = mid + 1;
            }
        }

        return max - min + 1;
    }
}
