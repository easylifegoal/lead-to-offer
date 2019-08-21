import java.util.*;

public class Solution {
    Queue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    Queue<Integer> min = new PriorityQueue<>();

    public void Insert(Integer num) {
        if (min.size() == 0 || min.peek() < num) {
            min.offer(num);
        } else {
            max.offer(num);
        }

        //balance
        if (max.size() > min.size()) {
            min.offer(max.poll());
        }

        if (min.size() - max.size() > 1) {
            max.offer(min.poll());
        }
    }

    public Double GetMedian() {
        if (min.size() > max.size()) return (double) min.peek();

        return (min.peek() + max.peek()) / 2.0;
    }


}
