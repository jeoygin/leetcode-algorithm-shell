public class Solution {
    public int minPathSum(int[][] grid) {
		int m = grid.length, n = grid[0].length, cur = 0, next;
        int[][] dp = new int[2][n];
		for (int r = 0; r < m; r++) {
			next = 1 - cur;
			for (int c = 0; c < n; c++) {
				int min = Integer.MAX_VALUE;
				if (r > 0) {
					min = dp[cur][c];
				} 
				if (c > 0) {
					min = Math.min(min, dp[next][c - 1]);
				}
				dp[next][c] = r + c > 0 ? min + grid[r][c] : grid[r][c];
			}
			cur = next;
		}
		return dp[cur][n - 1];
    }
}
