import java.util.*;
public class Solution {
    public int maximumGap(int[] num) {
        int n = num.length, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, avg, ret = 0;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, num[i]);
            max = Math.max(max, num[i]);
        }
        if (n < 2 || max == min) {
            return 0;
        }
        double gap = (max - min) * 1.0 / (n - 1);
        int[] bucket = new int[n * 2];
        Arrays.fill(bucket, -1);
        
        for (int d: num) {
            int idx = (int) ((d - min) / gap) * 2;
            if (bucket[idx] == -1 || bucket[idx] > d) {
                bucket[idx] = d;
            }
            bucket[idx + 1] = Math.max(bucket[idx + 1], d);
        }
        int prev = -1;
        for (int i = 0; i < n; i++) {
            if (bucket[i * 2] != -1) {
                if (prev != -1) {
                    ret = Math.max(ret, bucket[i * 2] - bucket[prev * 2 + 1]);
                }
                prev = i;
            }
        }
        return ret;
    }
}
