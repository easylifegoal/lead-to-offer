public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array.length == 0) return 0;
        int flag = 1;
        int num = array[0];

        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            if (tmp == num) {
                flag++;
            } else if (flag == 0) {
                num = tmp;
            } else {
                flag--;
            }
        }

        if (flag <= 0) return 0;

        return num;
    }
}
