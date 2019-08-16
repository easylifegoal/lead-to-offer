import java.util.*;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> in = new Stack<>();
        int index = 0;

        for (int num : pushA) {
            if (num == popA[index]) {
                index++;

                while (!in.isEmpty() && in.peek() == popA[index]) {
                    in.pop();
                    index++;
                }
            } else {
                in.push(num);
            }
        }

        if (in.isEmpty()) return true;

        return false;
    }
}
