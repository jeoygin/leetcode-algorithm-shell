public class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length(), m = p.length();
        boolean dp[][] = new boolean[n+1][m+1];
        dp[0][0] = true;
        for (int j = 1; j <= m; j++) {
        	if (j < m && p.charAt(j) == '*') {
        		dp[0][++j] = true;
        	} else {
        		break;
        	}
        }
        for (int i = 1; i <= n; i++) {
        	for (int j = 1; j <= m; j++) {
        		char sc = s.charAt(i-1);
        		char pc = p.charAt(j-1);
        		if (j < m && p.charAt(j) == '*') {
        			continue;
        		}
        		if (pc == '.' || pc == sc) {
        			dp[i][j] = dp[i-1][j-1];
        		} else if (pc == '*') {
        			pc = p.charAt(j-2);
        			if (pc != '.' && pc != sc) {
        				dp[i][j] = dp[i][j-2];
        			} else {
        				dp[i][j] = dp[i][j-2] || dp[i-1][j] || dp[i-1][j-2];
        			}
        		} else {
        			dp[i][j] = false;
        		}
        	}
        }
        return dp[n][m];
    }
}
