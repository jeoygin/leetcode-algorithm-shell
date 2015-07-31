public class Solution {
    public double pow(double x, int n) {
        if (Math.abs(n) <= 1) {
            return Math.pow(x, n);
        }
        double ret = pow(x, n / 2);
        ret *= ret;
        if ((n & 1) > 0) {
            ret *= n > 0 ? x : 1 / x;
        }
        return ret;
    }
}
