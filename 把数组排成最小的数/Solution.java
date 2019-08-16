import java.util.*;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        String[] strings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String str1 = o1 + o2;
                String str2 = o2 + o1;

                return str1.compareTo(str2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }

        return sb.toString();
    }
}
