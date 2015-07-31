import java.util.*;
public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length, m = dungeon[0].length;
        int min = 1, max = Integer.MAX_VALUE, mid, health = 0;
        int[][] dp = new int[n+1][m+1];
        while (min < max) {
            mid = min + ((max - min) >> 1);
            dp[0][1] = mid;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    health = Math.max(dp[i-1][j], dp[i][j-1]);
                    if (health > 0) {
                        dp[i][j] = health + dungeon[i-1][j-1];
                    } else {
                        dp[i][j] = 0;
                    }
                }
            }
            if (dp[n][m] > 0) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
}
