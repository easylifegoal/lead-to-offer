import java.util.*;

public class Solution {
    public void reOrderArray(int [] array) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();;
        for (int num : array) {
            if ((num & 1) == 1) odd.add(num);
            else even.add(num);
        }

        int index = 0;
        for (int num : odd) {
            array[index] = num;
            index++;
        }
        for (int num : even) {
            array[index] = num;
            index++;
        }
    }
}
