public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        if (B.length > A.length) {
            return findMedianSortedArrays(B, A);
        }
        int n = A.length, m = B.length, imin = 0, imax = m, median = ((n + m + 1) >> 1);
        while (imin <= imax) {
            int i = (imin + imax) >> 1;
            int j = median - i;
            if (j > 0 && i < m && A[j-1] > B[i]) {
                imin = i + 1;
            } else if (i > 0 && j < n && B[i-1] > A[j]) {
                imax = i - 1;
            } else {
                int num1 = Math.max(j > 0 ? A[j-1] : Integer.MIN_VALUE, 
                                    i > 0 ? B[i-1] : Integer.MIN_VALUE);
                int num2 = Math.min(j < n ? A[j] : Integer.MAX_VALUE, 
                                    i < m ? B[i] : Integer.MAX_VALUE);
                return (n + m) % 2 == 1 ? num1 : (num1 + num2) / 2.0;
            }
        }
        return 0;
    }
}
