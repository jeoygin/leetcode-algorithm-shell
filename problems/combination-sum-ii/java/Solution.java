import java.util.*;
public class Solution {
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int[] sortedNum = Arrays.copyOf(num, num.length);
        Arrays.sort(sortedNum);
        search(sortedNum, target, 0, new boolean[num.length], ret);
        return ret;
    }
    void search(int[] num, int target, int start, boolean[] aux, List<List<Integer>> ret) {
        if (target == 0) {
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < num.length; i++) {
                if (aux[i]) {
                    list.add(num[i]);
                }
            }
            ret.add(list);
            return;
        }
        for (int i = start; i < num.length; i++) {
            if (num[i] <= target && (i == 0 || num[i] != num[i-1] || aux[i-1])) {
                aux[i] = true;
                search(num, target - num[i], i + 1, aux, ret);
                aux[i] = false;
            }
        }
    }
}
