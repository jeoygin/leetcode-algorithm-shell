import java.util.*;
public class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<Character>();
        char[][] parentheses = new char[][] {{'(', ')'}, {'{', '}'}, {'[', ']'}};
        stack.push('.');
        for (char c: s.toCharArray()) {
            for (int i = 0; i < 3; i++) {
                if (c == parentheses[i][0]) {
                    stack.push(c);
                } else if (c == parentheses[i][1]) {
                    if (stack.pop() != parentheses[i][0]) {
                        return false;
                    }
                }
            }
        }
        return stack.size() == 1;
    }
}
