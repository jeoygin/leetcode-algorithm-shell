public class Solution {
    public String longestPalindrome(String s) {
        int max = 0, start = 0, n = s.length(), l;
        char[] str = s.toCharArray();
        for (int i = 0; i < n; i++) {
        	for (l = 0; i - l >= 0 && i + l < n && str[i-l] == str[i+l]; l++);
        	if (l * 2 - 1 > max) {
        		max = l * 2 - 1;
        		start = i - l + 1;
        	}
        	for (l = 0; i - l >= 0 && i + 1 + l < n && str[i-l] == str[i+1+l]; l++);
        	if (l * 2 > max) {
        		max = l * 2;
        		start = i - l + 1;
        	}
        }
        return s.substring(start, start + max);
    }
}
