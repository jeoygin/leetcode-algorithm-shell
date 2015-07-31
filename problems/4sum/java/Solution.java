import java.util.*;
public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        int n = num.length;
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        Arrays.sort(num);
        for (int i = 0; i < n; i++) {
            if (i > 0 && num[i] == num[i-1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && num[j] == num[j-1]) {
                    continue;
                }
                List<List<Integer>> latter = new ArrayList<List<Integer>>();
                int l = j + 1, r = n - 1, left = target - num[i] - num[j];
                while (l < r) {
                    int sum = num[l] + num[r];
                    if (sum <= left) {
                        if (sum == left) {
                            List<Integer> list = new ArrayList<Integer>();
                            Collections.addAll(list, num[i], num[j], num[l], num[r]);
                            ret.add(list);
                        }
                        for (l++; l < r && num[l-1] == num[l]; l++);
                    } else {
                        for (r--; l < r && num[r+1] == num[r]; r--);
                    }
                }
            }
        }
        return ret;
    }
}
