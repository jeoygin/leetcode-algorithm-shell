public class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = n > 0 ? matrix[0].length : 0, col = -1;
        for (int c = 0; c < m; c++) {
            for (int r = 0; r < n; r++) {
                if (matrix[r][c] == 0) {
                    col = col >= 0 ? col : c;
                    for (int k = 0; k < n; k++) {
                        if (matrix[k][c] == 0) {
                            matrix[k][col] = 1;
                        } else {
                            matrix[k][c] = 0;
                        }
                    }
                    break;
                }
            }
        }
        for (int r = 0; r < n && col >= 0; r++) {
            if (matrix[r][col] == 1) {
                java.util.Arrays.fill(matrix[r], 0);
            }
        }
    }
}
