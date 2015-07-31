import java.util.*;
public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = num.length;
        Arrays.sort(num);
        for (int i = 0; i < n; i++) {
            if (i > 0 && num[i] == num[i-1]) {
                continue;
            }
            int l = i + 1, r = n - 1, target = -num[i];
            while (l < r) {
                int sum = num[l] + num[r];
                if (sum <= target) {
                    if (sum == target) {
                        res.add(Arrays.asList(num[i], num[l], num[r]));
                    }
                    for (l++; l < r && num[l-1] == num[l]; l++);
                } else {
                    for (r--; l < r && num[r+1] == num[r]; r--);
                }
            }
        }
        return res;
    }
}
