import java.util.*;
public class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int n = matrix.length, m = matrix[0].length, res = 0, top;
        int[] height = new int[m], stack = new int[m];
        for (int i = 0; i < n; i++) {
            top = -1;
            for (int j = 0; j < m; j++) {
                height[j] += matrix[i][j] == '1' ? 1 : -height[j];
                if (height[j] > 0) {
                    while (top > 0 && height[stack[top]] >= height[j]) {
                        top--;
                    }
                    stack[++top] = j;
                    int lastHeight = height[j];
                    for (int k = top; k > 0; k--) {
                        lastHeight = height[stack[k]];
                        res = Math.max(res, (j-stack[k-1]) * lastHeight);
                    }
                    res = Math.max(res, Math.min(height[stack[0]], lastHeight) * (j - stack[0] + 1));
                } else {
                    top = -1;
                }
            }
        }
        return res;
    }
}
