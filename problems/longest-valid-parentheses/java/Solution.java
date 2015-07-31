public class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length(), res = 0;
        int[] dp = new int[n];
        for (int j = n - 1; j >= 0; j--) {
            if (s.charAt(j) == '(') {
                if (j + 1 < n && j + 1 + dp[j+1] < n && s.charAt(j + 1 + dp[j+1]) == ')') {
                    dp[j] = dp[j+1] + 2;
                }
                if (j + dp[j] < n) {
                    dp[j] += dp[j + dp[j]];
                }
                res = Math.max(res, dp[j]);
            }
        }
        return res;
    }
}
