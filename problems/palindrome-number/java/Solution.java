public class Solution {
    public boolean isPalindrome(int x) {
    	if (x == 0) {
    		return true;
    	} else if (x < 0 || x % 10 == 0) {
    		return false;
    	}
        int high = 0;
        while (high / x <= 1) {
        	if (x == high || x / 10 == high) {
        		return true;
        	}
        	high = high * 10 + x % 10;
        	x /= 10;
        }
        return false;
    }
}
