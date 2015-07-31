import java.util.*;
public class Solution {
    public int largestRectangleArea(int[] height) {
        int n = height.length, ret = 0;
        int[] left = new int[n], right = new int[n];
        scan(height, left, 0, n - 1, 1, 0);
        scan(height, right, n - 1, 0, -1, n - 1);
        for (int i = 0; i < n; i++) {
            ret = Math.max(ret, height[i] * (right[i] - left[i] + 1));
        }
        return ret;
    }
    void scan(int[] height, int[] prev, int start, int end, int step, int init) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        for (int i = start; (end - i) * step >= 0; i += step) {
            prev[i] = init;
            while (!stack.isEmpty() && height[stack.peek()] >= height[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                prev[i] = stack.peek() + step;
            }
            stack.push(i);
        }
    }
}
