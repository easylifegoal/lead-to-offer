import java.util.*;

public class Solution {
    public String LeftRotateString(String str,int n) {
        char[] chs = str.toCharArray();
        if (chs.length == 0) return str;
        n = n % chs.length;

        reverse(chs, 0, chs.length - 1);
        reverse(chs, 0, chs.length - 1 - n);
        reverse(chs, chs.length - n, chs.length - 1);

        return new String(chs);
    }

    private void reverse(char[] chs, int start, int end) {
        Stack<Character> stack = new Stack<>();

        for (int i = start; i <= end; i++) {
            stack.push(chs[i]);
        }

        for (int i = start; i <= end; i++) {
            chs[i] = stack.pop();
        }
    }
}
