public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length, m = n > 0 ? obstacleGrid[0].length : 0, cur = 0, next;
        int[][] dp = new int[2][m + 1];
        dp[0][1] = 1 - obstacleGrid[0][0];
        for (int i = 0; i < n; i++) {
            next = 1 - cur;
            for (int j = 1; j <= m; j++) {
                if (obstacleGrid[i][j - 1] == 0) {
                    dp[next][j] = dp[cur][j] + dp[next][j-1];
                } else {
                    dp[next][j] = 0;
                }
            }
            cur = next;
        }
        return dp[cur][m];
    }
}
