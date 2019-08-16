import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= sum / 2; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            int res = 0;

            for (int j = i; j <= sum; j++) {
                res += j;
                tmp.add(j);
                if (res >= sum) {
                    if (res == sum) ans.add(tmp);
                    break;
                }
            }
        }

        return ans;
    }
}
