public class Solution {
    int index = 0;

    public boolean isNumeric(char[] str) {
        if (str.length == 0) return false;

        boolean ans = scanInteger(str);

        if (index < str.length && str[index] == '.') {
            index++;
            ans = scanUnsignedInteger(str) || ans;
        }

        if (index < str.length
            && (str[index] == 'e' || str[index] == 'E')) {
            index++;
            ans = scanInteger(str) && ans;
        }

        return ans && index == str.length;
    }

    private boolean scanInteger(char[] str) {
        if (index >= str.length) return false;
        if (str[index] == '+' || str[index] == '-') {
            index++;
        }

        return scanUnsignedInteger(str);
    }

    private boolean scanUnsignedInteger(char[] str) {
        int tmp = index;

        while (index < str.length
               && str[index] >= '0' && str[index] <= '9')
            index++;

        return index > tmp;
    }
}
