import java.util.*;
public class Solution {
    public int minCut(String s) {
    	char[] chars = s.toCharArray();
    	int[] dp = new int[s.length() + 1];
    	Arrays.fill(dp, Integer.MAX_VALUE);
    	dp[0] = 0;
    	for (int i = 0; i < s.length(); i++) {
    		for (int j = 0; i - j >= 0 && i + j < s.length() && s.charAt(i - j) == s.charAt(i + j); j++) {
    			dp[i+j+1] = Math.min(dp[i+j+1], dp[i-j] + 1);
    		}
    		for (int j = 0; i - j >= 0 && i + 1 + j < s.length() && s.charAt(i - j) == s.charAt(i + 1 + j); j++) {
    			dp[i+j+2] = Math.min(dp[i+j+2], dp[i-j] + 1);
    		}
    		
    	} 
    	return dp[s.length()] - 1;
    }
}
