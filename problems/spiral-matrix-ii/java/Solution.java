import java.util.*;
public class Solution {
    public int[][] generateMatrix(int n) {
        int row = 0, col = -1, minRow = 0, maxRow = n - 1, minCol = 0, maxCol = n - 1, d = 0;
        int[] dr = new int[]{0, 1, 0, -1}, dc = new int[]{1, 0, -1, 0};
        int[][] matrix = new int[n][n];
        int left = n * n, cur = 1;
        while (left > 0) {
            int nextRow = row + dr[d];
            int nextCol = col + dc[d];
            if (nextRow >= minRow && nextRow <= maxRow && nextCol >= minCol && nextCol <= maxCol) {
                matrix[nextRow][nextCol] = cur++;
                row = nextRow;
                col = nextCol;
                left--;
            } else {
                if (d == 0) {
                    minRow++;
                } else if (d == 1) {
                    maxCol--;
                } else if (d == 2) {
                    maxRow--;
                } else {
                    minCol++;
                }
                d = (d + 1) % dr.length;
            }
        }
        return matrix;
    }
}
