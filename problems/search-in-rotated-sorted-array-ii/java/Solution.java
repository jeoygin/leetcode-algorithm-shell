import java.util.*;
public class Solution {
    public boolean search(int[] A, int target) {
        int low = 0, high = A.length - 1, mid;
        while (low < high) {
            mid = (high + low) >> 1;
            if (A[mid] == target) {
                return true;
            } else if (target > A[mid]) {
                if (target <= A[high] || A[high] < A[mid]) {
                    low = mid + 1;
                } else if (A[high] != A[low] || A[low] != A[mid]) {
                    high = mid;
                } else {
                    low++;
                    high--;
                }
            } else {
                if (target >= A[low] || A[low] > A[mid]) {
                    high = mid;
                } else if (A[high] != A[low] || A[low] != A[mid]) {
                    low = mid + 1;
                } else {
                    low++;
                    high--;
                }
            }
        }
        return A[low] == target;
    }
}
