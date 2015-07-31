public class Solution {
    public int sqrt(int x) {
        int low = 1, high = x, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low - 1;
    }
}
