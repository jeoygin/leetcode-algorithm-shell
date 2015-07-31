public class MinStack {
    LinkedList<Integer> stack = new LinkedList<Integer>();
    int min = Integer.MAX_VALUE;
    boolean reCal = true;

    public void push(int x) {
        stack.push(x);
        if (x < min) {
            min = x;
            reCal = false;
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            if (top == min) {
                reCal = true;
            }
        }
    }

    public int top() {
        return !stack.isEmpty() ? stack.peek() : 0;
    }

    public int getMin() {
        if (reCal) {
            int min = Integer.MAX_VALUE;
            for (Integer e: stack) {
                min = Math.min(min, e);
            }
            reCal = false;
            this.min = min;
        }
        return min;
    }
}