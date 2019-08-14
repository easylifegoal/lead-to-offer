import java.util.*;

public class Solution {
    Map<Character, Integer> map = new HashMap<>();
    Queue<Character> queue = new LinkedList<>();
    char cur = '#';
    //Insert one char from stringstream
    public void Insert(char ch) {
        int count = map.getOrDefault(ch, 0) + 1;
        map.put(ch, count);
        queue.offer(ch);
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        if (cur != '#' && map.get(cur) == 1) {
            return cur;
        }

        while (!queue.isEmpty()) {
            char ch = queue.poll();
            if (map.get(ch) == 1) {
                cur = ch;
                return ch;
            }
        }

        return '#';
    }
}
