import java.util.*;
public class Solution {
    public List<List<Integer>> permuteUnique(int[] num) {
        int n = num.length, i, j, k;
        List<Integer> list = new ArrayList<Integer>();
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int d: num) {
            list.add(d);
        }
        Collections.sort(list);
        ret.add(new ArrayList<Integer>(list));
        do {
            for (i = n - 2; i >= 0 && list.get(i) >= list.get(i+1); i--);
            if (i >= 0) {
                for (j = n - 1; j > i && list.get(j) <= list.get(i); j--);
                Collections.swap(list, i, j);
                for (j = i + 1, k = n - 1; j < k; j++, k--) {
                    Collections.swap(list, j, k);
                }
                ret.add(new ArrayList<Integer>(list));
            }
        } while (i >= 0);
        return ret;
    }
}
