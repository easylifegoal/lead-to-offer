public class Solution {
    public double Power(double base, int exponent) {
        int n = exponent;
        if(exponent < 0) {
            if(base == 0) {
                throw new RuntimeException();
            }
            n = -n;
        }
        if(exponent == 0)
            return 1;
        double res = 1;
        while(n != 0) {
            if((n & 1) == 1)
                res *= base;
            base *= base;
            n >>= 1;
        }
        return exponent > 0 ? res : (1 / res);
  }
}
