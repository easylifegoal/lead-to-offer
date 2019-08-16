public class Solution {
    public int Fibonacci(int n) {
        int one = 0;
        int two = 1;

        for (int i = 0; i < n; i++) {
            int tmp = two;
            two = one + two;
            one = tmp;
        }

        return one;
    }
}
