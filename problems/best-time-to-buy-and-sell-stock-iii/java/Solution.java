public class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length, min = n > 0 ? prices[0] : Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int[] best = new int[n];
        for (int i = 1; i < n; i++) {
            best[i] = best[i-1];
            if (min < prices[i]) {
                best[i] = Math.max(best[i], prices[i] - min);
            }
            min = Math.min(min, prices[i]);
        }
        int ret = n > 0 ? best[n - 1] : 0, profit = 0;
        for (int i = n - 1; i > 0; i--) {
            if (prices[i] < max) {
                profit = Math.max(profit, max - prices[i]);
            }
            ret = Math.max(ret, profit + best[i-1]);
            max = Math.max(max, prices[i]);
        }
        return ret;
    }
}
