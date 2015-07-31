import java.util.*;
public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        if (B.length > A.length) {
            return findMedianSortedArrays(B, A);
        }
        int n = A.length, m = B.length;
        int median = (n + m - 1) / 2, max = median, min = (n - m - 1) / 2, mid;
        while (min < max) {
            mid = (min + max) / 2;
            int idx = median - mid - 1;
            if (idx < 0 || B[idx] <= A[mid]) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        if (B.length == 0) {
            return n % 2 == 1 ? A[n/2] : (A[n/2] + A[n/2-1]) / 2.0;
        }
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(min - 1 >= 0 ? A[min-1] : Integer.MIN_VALUE);
        arr.add(A[min]);
        arr.add(min + 1 < n ? A[min+1] : Integer.MAX_VALUE);
        arr.add(median - min - 1 >= 0 ? B[median-min-1] : Integer.MIN_VALUE);
        arr.add(median - min < m ? B[median-min] : Integer.MAX_VALUE);
        arr.add(median - min + 1 < m ? B[median-min+1] : Integer.MAX_VALUE);
        Collections.sort(arr);

        if ((n + m) % 2 == 1) {
            return Math.min(arr.get(2), arr.get(3));
        } else {
            return (arr.get(2) + arr.get(3)) / 2.0;
        }
    }
}
