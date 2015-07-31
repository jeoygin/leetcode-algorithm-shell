public class Solution {
    int r, c;
    public boolean searchMatrix(int[][] matrix, int target) {
        r = matrix.length;
        c = matrix[0].length;
        int low = 0, high = r * c - 1, mid;
        while (low < high) {
            mid = (high + low) >> 1;
            if (val(matrix, mid) == target) {
                return true;
            } else if (target > val(matrix, mid)) {
                if (target <= val(matrix, high) || val(matrix, high) < val(matrix, mid)) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            } else {
                if (target >= val(matrix, low) || val(matrix, low) > val(matrix, mid)) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return val(matrix, low) == target;
    }

    private int val(int[][] matrix, int idx) {
        return matrix[idx / c][idx % c];
    }
}
