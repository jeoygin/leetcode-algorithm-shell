import java.util.*;
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size(), cur = 0, next;
        int[][] dp = new int[2][n];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++, cur = next) {
            next = 1 - cur;
            dp[next][0] = dp[cur][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; j++) {
                dp[next][j] = Math.min(dp[cur][j-1], dp[cur][j]) + triangle.get(i).get(j);
            }
            dp[next][i] = dp[cur][i - 1] + triangle.get(i).get(i);
        }
        int min = dp[cur][0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, dp[cur][i]);
        }
        return min;
    }
}
