import java.util.*;
public class Solution {
    public int largestRectangleArea(int[] height) {
        int n = height.length, res = 0, top = -1;
        int[] stack = new int[n+1];
        for (int i = 0; i <= n; i++) {
            int curH = i < n ? height[i] : 0;
            while (top >= 0 && curH < height[stack[top]]) {
                int h = height[stack[top--]];
                res = Math.max(res, h * (top == -1 ? i : i - stack[top] - 1));
            }
            stack[++top] = i;
        }
        return res;
    }
}
