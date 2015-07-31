public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && Math.abs(divisor) == 1) {
            return divisor == 1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        if (divisor == Integer.MIN_VALUE) {
            return dividend == Integer.MIN_VALUE ? 1 : 0;
        }
        int res = 0, remainder = dividend, sign = (dividend < 0 ^ divisor < 0) ? -1 : 1;
        while (remainder != 0) {
            if (remainder < 0 && remainder > sign * divisor || remainder > 0 && remainder < sign * divisor) {
                break;
            }
            int quotient = sign;
            int tmp = sign * divisor;
            while (remainder != tmp && Math.abs(remainder - tmp) > Math.abs(tmp)) {
                tmp += tmp;
                quotient += quotient;
            }
            res += quotient;
            remainder -= tmp;
        }
        return res;
    }
}
