import java.util.*;
public class Solution {
    public int trap(int[] A) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        int ret = 0;
        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && A[i] >= A[stack.peek()]) {
                int p = stack.pop();
                if (!stack.isEmpty()) {
                    ret += (Math.min(A[i], A[stack.peek()]) - A[p]) * (i - stack.peek() - 1);
                }
            }
            stack.push(i);
        }
        return ret;
    }
}
