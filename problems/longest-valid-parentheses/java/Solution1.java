public class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length(), res = 0;
        char[] ps = s.toCharArray();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ps[j] == '(') {
                    if (j + 1 < n && j + 1 + dp[j+1] < n && ps[j + 1 + dp[j+1]] == ')') {
                        dp[j] = Math.max(dp[j], dp[j+1] + 2);
                    }
                    if (j + dp[j] < n) {
                        dp[j] += dp[j + dp[j]];
                    }
                    res = Math.max(res, dp[j]);
                }
            }
        }
        return res;
    }
}
