import java.util.*;
public class Solution {
    public int numDistinct(String S, String T) {
        int n = S.length(), m = T.length(), cur = 0, next;
        int[][] dp = new int[2][m+1];
        Arrays.fill(dp[0], 0);
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            next = 1 - cur;
            dp[next][0] = 1;
            for (int j = 1; j <= m; j++) {
                dp[next][j] = dp[cur][j] + (S.charAt(i-1) == T.charAt(j-1) ? dp[cur][j-1] : 0);
            }
            cur = next;
        }
        return dp[cur][m];
    }
}
