public class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        } if (dividend > 0) {
            return -divide(-dividend, divisor);
        } else if (divisor > 0) {
            return -divide(dividend, -divisor);
        }
        int res = 0;
        while (dividend <= divisor) {
            int shift = 0;
            for (int t = divisor << shift; dividend - t <= t; shift++, t <<= 1);
            res |= 1 << shift;
            dividend -= divisor << shift;
        }
        return res >= 0 ? res : Integer.MAX_VALUE;
    }
}
