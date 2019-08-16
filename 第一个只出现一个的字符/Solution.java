public class Solution {
    public int FirstNotRepeatingChar(String str) {
        int[] counts = new int[256];
        char[] chs = str.toCharArray();

        for (char ch : chs) {
            counts[ch - '\0']++;
        }

        for (int i = 0; i < chs.length; i++){
            if (counts[chs[i] - '\0'] == 1) return i;
        }

        return -1;
    }
}
