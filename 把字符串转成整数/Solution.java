public class Solution {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0) return 0;

        char[] chs = str.toCharArray();
        int index = 0;
        while (index < chs.length
               && (chs[index] == '0' || chs[index] == ' ')) index++;

        int flag = 0;
        if (index < chs.length && (chs[index] == '+' || chs[index] == '-')) {
            if (chs[index] == '-') flag = 1;
            index++;
        }

        int res = 0;
        for (int i = index; i < chs.length; i++) {
            char num = chs[i];
            if (num > '9' || num < '0') return 0;
            res = res * 10 + num - '0';
        }

        return flag == 0 ? res : -res;
    }
}
