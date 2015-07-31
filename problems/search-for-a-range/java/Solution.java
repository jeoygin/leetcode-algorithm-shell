public class Solution {
    public int[] searchRange(int[] A, int target) {
        int start = searchFirst(A, target, 0, A.length - 1), end;
        if (A[start] != target) {
            return new int[]{-1, -1};
        }
        end = searchFirst(A, target + 1, start, A.length - 1);
        return new int[]{start, A[end] != target ? end - 1 : end};
    }

    int searchFirst(int[] A,  int target, int low, int high) {
        int mid;
        while (low < high) {
            mid = (low + high) >> 1;
            if (A[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
