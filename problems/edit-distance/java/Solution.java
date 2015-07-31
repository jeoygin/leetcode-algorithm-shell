public class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length(), cur = 0, next;
        int[][] dp = new int[2][m+1];
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= n; i++) {
            next = 1 - cur;
            dp[next][0] = i;
            for (int j = 1; j <= m; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[next][j] = dp[cur][j-1];
                } else {
                    dp[next][j] = Math.min(dp[cur][j-1], Math.min(dp[cur][j], dp[next][j-1])) + 1;
                }
            }
            cur = next;
        }
        return dp[cur][m];
    }
}
