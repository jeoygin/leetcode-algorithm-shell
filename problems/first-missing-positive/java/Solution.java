public class Solution {
    public int firstMissingPositive(int[] A) {
        for (int i = 0; i < A.length; i++) {
            while (A[i] != i + 1 && A[i] > 0 && A[i] <= A.length && A[A[i]-1] != A[i]) {
                int t = A[A[i]-1];
                A[A[i]-1] = A[i];
                A[i] = t;
            }
        }
        int ret = 1;
        for (; ret <= A.length && A[ret-1] == ret; ret++);
        return ret;
    }
}
