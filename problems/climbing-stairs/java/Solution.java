public class Solution {
    public int climbStairs(int n) {
        int[] f = new int[]{1, 1};
        int cur = 0;
        for (int i = 2; i <= n; i++) {
            f[cur] += f[1 - cur];
            cur = 1 - cur;
        }
        return f[n & 1];
    }
}
