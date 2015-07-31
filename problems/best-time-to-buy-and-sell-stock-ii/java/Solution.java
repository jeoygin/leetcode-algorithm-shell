public class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i+1]) {
                int j = i + 1;
                while (j < prices.length - 1 && prices[j] > prices[i] && prices[j+1] > prices[j]) {
                    j++;
                }
                ans += prices[j] - prices[i];
                i = j;
            }
        }
        return ans;
    }
}
