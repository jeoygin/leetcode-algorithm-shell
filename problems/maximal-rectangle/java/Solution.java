public class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int n = matrix.length, m = matrix[0].length, res = 0, top;
        int[] height = new int[m + 1], stack = new int[m+1];
        for (int i = 0; i < n; i++) {
            top = -1;
            for (int j = 0; j <= m; j++) {
                height[j] += j < m && matrix[i][j] == '1' ? 1 : -height[j];
                while (top >= 0 && height[j] < height[stack[top]]) {
                    int h = height[stack[top--]];
                    res = Math.max(res, h * (top == -1 ? j : j - stack[top] - 1));
                }
                stack[++top] = j;
            }
        }
        return res;
    }
}
