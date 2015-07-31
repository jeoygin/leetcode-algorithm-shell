import java.util.*;
public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, min = 999999999;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			} else {
				profit = Math.max(profit, prices[i] - min);
			}
		}
		return profit;
    }
}
