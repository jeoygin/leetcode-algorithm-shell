public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[2][n + 1];
        int cur = 0, next = 0;
        dp[0][1] = 1;
        for (int i = 0; i < m; i++) {
        	next = 1 - cur;
        	for (int j = 1; j <= n; j++) {
        		dp[next][j] = dp[cur][j] + dp[next][j-1];
        	}
        	cur = next;
        }
        return dp[next][n];
    }
}