//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
import java.util.*;

public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int res = 0;
        for (int num : array) {
            res ^= num;
        }

        //find the 1st 1, such as 1010, to divide 2 arrays
        int index = 0;
        while ((res & 1) != 1) {
            res >>>= 1;
            index++;
        }

        int tmp = 1 << index;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int num : array) {
            if ((num & tmp) == tmp) list1.add(num);
            else list2.add(num);
        }

        res = 0;
        for (int num : list1) {
            res ^= num;
        }
        num1[0] = res;

        res = 0;
        for (int num : list2) {
            res ^= num;
        }
        num2[0] = res;
    }
}
