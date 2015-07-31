public class Solution {
    public boolean canJump(int[] A) {
        int end = 0;
        for (int i = 0; i <= end && i < A.length; i++) {
            end = Math.max(end, i + A[i]);
        }
        return end >= A.length - 1;
    }
}
