public class Solution {
    int maxSum(int[]A, int s, int e, int inc) {
        int sum = 0, ans = A[s];
        for (int i = s; (i - e) * inc <= 0; i += inc) {
            sum += A[i];
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
    int maxSubArray(int[] A, int s, int e) {
        if (s == e) {
            return A[s];
        }
        int ans = Math.max(maxSubArray(A, s, (s + e) / 2), maxSubArray(A, (s + e) / 2 + 1, e));
        ans = Math.max(ans, maxSum(A, (s + e) / 2, s, -1) + maxSum(A, (s + e) / 2 + 1, e, 1));
        return ans;
    }
    
    public int maxSubArray(int[] A) {
        return maxSubArray(A, 0, A.length - 1);
    }
}
