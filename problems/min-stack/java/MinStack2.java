import java.util.*;
public class MinStack {
    LinkedList<Integer> stack = new LinkedList<Integer>();
    LinkedList<Integer> minStack = new LinkedList<Integer>();

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            if (top == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        return !stack.isEmpty() ? stack.peek() : 0;
    }

    public int getMin() {
        return !minStack.isEmpty() ? minStack.peek() : 0;
    }
}
