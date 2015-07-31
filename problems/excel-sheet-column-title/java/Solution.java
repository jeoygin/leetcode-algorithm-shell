import java.util.*;
public class Solution {
    public String convertToTitle(int n) {
        int d = n;
        LinkedList<Character> stack = new LinkedList<Character>();
        while (d > 0) {
            stack.push((char)('A' + --d % 26));
            d /= 26;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
