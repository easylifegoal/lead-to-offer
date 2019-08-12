public class Solution {
    public int Add(int num1,int num2) {
        int carry = (num1 & num2) << 1;
        int ans = num1 ^ num2;
        while (carry != 0) {
            int tmp = carry & ans;
            ans = carry ^ ans;
            carry = tmp << 1;
        }

        return ans;
    }
}
