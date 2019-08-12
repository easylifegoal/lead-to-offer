public class Solution {
    public int JumpFloor(int target) {
        if (target == 1) return 1;
        if (target == 2) return 2;

        int one = 1;
        int two = 2;
        for (int i = 3; i <= target; i++) {
            int tmp = two;
            two += one;
            one = tmp;
        }

        return two;
    }
}
