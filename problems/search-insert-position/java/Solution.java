public class Solution {
    public int searchInsert(int[] A, int target) {
        int low = 0, mid, high = A.length - 1;
        while (low <= high) {
            mid = (low + high) >> 1;
            if (A[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
