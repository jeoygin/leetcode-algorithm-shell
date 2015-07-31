import java.util.*;
public class Solution {
    public String addBinary(String a, String b) {
        int len = Math.max(a.length(), b.length()), carry = 0;
        LinkedList<Integer> stack = new LinkedList<Integer>();
        for (int i = 1; i <= len || carry > 0; i++) {
            int sum = parse(a, a.length() - i) + parse(b, b.length() - i) + carry;
            carry = sum / 2;
            stack.push(sum % 2);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    int parse(String s, int i) {
        if (i < 0 || i >= s.length()) {
            return 0;
        }
        return s.charAt(i) - '0';
    }
}
