import java.util.*;
public class MinStack {
    LinkedList<Integer> stack = new LinkedList<Integer>();
    int min = Integer.MAX_VALUE;

    public void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (!stack.isEmpty()) {
            if (stack.peek() == min) {
                stack.pop();
                min = stack.pop();
            } else {
                stack.pop();
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
