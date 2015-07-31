import java.util.*;
public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        int n = s.length();
        boolean[] dp = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (String word: dict) {
                int m = word.length();
                if (i + 1 >= m && s.substring(i - m + 1, i + 1).equals(word)) {
                    if (i == m - 1 || dp[i - m]) {
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[n - 1];
    }
}
