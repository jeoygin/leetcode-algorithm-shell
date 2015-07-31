import java.util.*;
public class Solution {
    public boolean isScramble(String s1, String s2) {
        int n = s1.length();
        boolean[][][] dp = new boolean[n+1][n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[1][i][j] = s1.charAt(i) == s2.charAt(j);
            }
        }
        for (int l = 1; l <= n; l++) {
            for (int i = 0; i <= n - l; i++) {
                for (int j = 0; j <= n - l; j++) {
                    for (int k = 1; k < l; k++) {
                        if (dp[k][i][j] && dp[l-k][i+k][j+k] ||
                            dp[k][i][j+l-k] && dp[l-k][i+k][j]) {
                            dp[l][i][j] = true;
                            break;    
                        }
                    }
                }
            }
        }
        return dp[n][0][0];
    }
}
