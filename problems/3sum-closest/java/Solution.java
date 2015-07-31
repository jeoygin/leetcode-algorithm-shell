import java.util.*;
public class Solution {
    public int threeSumClosest(int[] num, int target) {
        int n = num.length, ret = num[0] + num[1] + num[2];
        int[] sorted = Arrays.copyOf(num, n);
        Arrays.sort(sorted);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int twoSum = sorted[i] + sorted[j];
                int pos = Arrays.binarySearch(sorted, j + 1, n, target - twoSum);
                if (pos >= 0) {
                    return twoSum + sorted[pos];
                }
                pos = -(pos + 1);
                for (int k = -1; k <= 0; k++) {
                    if (pos + k > j && pos + k < n && Math.abs(target - twoSum - sorted[pos + k]) < Math.abs(target - ret)) {
                        ret = twoSum + sorted[pos + k];
                    }
                }
            }
        }
        return ret;
    }
}
