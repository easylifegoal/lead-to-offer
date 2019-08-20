import java.util.*;

public class Solution {
    public boolean isContinuous(int [] numbers) {
        if (numbers.length == 0) return false;

        Arrays.sort(numbers);
        int zeros = 0;
        int index = 0;
        int gap = 0;

        while (index < numbers.length && numbers[index] == 0) {
            zeros++;
            index++;
        }

        index++;
        while (index < numbers.length) {
            if (numbers[index] == numbers[index - 1]) return false;
            gap += numbers[index] - numbers[index - 1] - 1;
            if (gap > zeros || gap > 4) return false;
            index++;
        }

        return true;
    }
}
