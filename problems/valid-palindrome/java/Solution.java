public class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        int left = 0, right = s.length() - 1;
        while (left < right) {
            for (; left < right && !isValid(s.charAt(left)); left++);
            for (; left < right && !isValid(s.charAt(right)); right--);
            int diff = s.charAt(left) - s.charAt(right);
            if (left++ < right-- && !(diff == 0 || Math.abs(diff) == 32)) {
                return false;
            }
        }
        return true;
    }
    boolean isValid(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9';
    }
}
