public class Solution {
    public int trailingZeroes(int n) {
        if (n >= 5) {
            return n / 5 + trailingZeroes(n / 5);
        }
        return 0;
    }
}
