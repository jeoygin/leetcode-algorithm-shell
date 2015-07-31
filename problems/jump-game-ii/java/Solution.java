import java.util.*;
public class Solution {
    public int jump(int[] A) {
        int n = A.length, cur = 0, prev = -1, ret = 0, i = 0;
        while (cur < n - 1 && cur != prev) {
            prev = cur;
            for (; i <= prev; i++) {
                cur = Math.max(cur, i + A[i]);
            }
            ret++;
        }
        return cur >= n - 1 ? ret : -1;
    }
}
