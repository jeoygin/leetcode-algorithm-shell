public class Solution {
    public int maxProduct(int[] A) {
    	int n = A.length, res;
        int[][] dp = new int[2][n];
        res = dp[0][0] = dp[1][0] = A[0];
        for (int i = 1; i < n; i++) {
        	dp[0][i] = dp[1][i] = A[i];
        	if (A[i] < 0) {
        		dp[0][i] = Math.min(dp[0][i], dp[1][i-1] * A[i]);
        		dp[1][i] = Math.max(dp[1][i], dp[0][i-1] * A[i]);
        	} else {
        		dp[0][i] = Math.min(dp[0][i], dp[0][i-1] * A[i]);
        		dp[1][i] = Math.max(dp[1][i], dp[1][i-1] * A[i]);
        	}
        	res = Math.max(res, dp[1][i]);
        }
        return res;
    }
}
