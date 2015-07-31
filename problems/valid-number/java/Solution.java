public class Solution {
    public boolean isNumber(String s) {
        boolean dot = false, sign = false, num = false;
        int start = 0, end = s.length() - 1;
        for (; start <= end && s.charAt(start) == ' '; start++);
        for (; end >= start && s.charAt(end) == ' '; end--);
        if (end < start) {
        	return false;
        }
        for (int i = start; i <= end; i++) {
        	char c = s.charAt(i);
        	if (c == '.') {
        		if (dot) {
        			return false;
        		}
        		dot = true;
        	} else if (c == 'e') {
        		if (i + 1 <= end && (s.charAt(i + 1) == '-' || s.charAt(i + 1) == '+')) {
        			i++;
        		}
        		if (i == end || !num) {
        			return false;
        		}
        		for (i++; i <= end; i++) {
        			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
        				return false;
        			}
        		}
        	} else if (c == '+' || c == '-') {
        		if (sign || i > start) {
        			return false;
        		}
        		sign = true;
        	} else if (c >= '0' && c <= '9') {
        		sign = true;
        		num = true;
        	} else {
        		return false;
        	}
        }
        return !dot || num;
    }
}
