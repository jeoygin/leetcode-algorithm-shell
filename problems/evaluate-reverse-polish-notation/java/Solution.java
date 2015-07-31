import java.util.*;
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int a, b, c;
        for (int i = 0; i < tokens.length; i++) {
        	if (tokens[i].length() > 1 || tokens[i].charAt(0) >= '0') {
        		stack.push(Integer.parseInt(tokens[i]));
        	} else {
        		b = stack.pop();
        		a = stack.pop();
        		if (tokens[i].equals("+")) {
        			c = a + b;
        		} else if (tokens[i].equals("-")) {
        			c = a - b;
        		} else if (tokens[i].equals("*")) {
        			c = a * b;
        		} else{
        			c = a / b;
        		}
        		stack.push(c);
        	}
        }
        return stack.peek();
    }
}
