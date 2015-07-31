import java.util.*;
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0, left = rows * cols;
        int row = 0, col = -1, minRow = 0, maxRow = rows - 1, minCol = 0, maxCol = cols - 1, d = 0;
        int[] dr = new int[]{0, 1, 0, -1}, dc = new int[]{1, 0, -1, 0};
        while (left > 0) {
            int nextRow = row + dr[d];
            int nextCol = col + dc[d];
            if (nextRow >= minRow && nextRow <= maxRow && nextCol >= minCol && nextCol <= maxCol) {
                list.add(matrix[nextRow][nextCol]);
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
        return list;
    }
}
