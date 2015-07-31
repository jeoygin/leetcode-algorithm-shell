import java.util.*;
public class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length(), m = num2.length(), offset;
        char[] res = new char[n+m+1];
        Arrays.fill(res, '0');
        for (int i = 0; i < n; i++) {
        	int carry = 0;
        	for (int j = 0; j < m || carry > 0; j++) {
        		int mul = res[n+m-i-j] - '0' + carry;
        		if (j < m) {
        			mul += (num1.charAt(n - 1 - i) - '0') * (num2.charAt(m - 1 - j) - '0');
        		}
        		res[n+m-i-j] = (char)('0' + mul % 10);
        		carry = mul / 10;
        	}
        }
        for (offset = 0; offset < n + m && res[offset] == '0'; offset++);
        return new String(res, offset, n + m + 1 - offset);
    }
}
