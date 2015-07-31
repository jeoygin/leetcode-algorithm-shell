import java.util.*;
public class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<String>();
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (buf.length() > 0) {
                    stack.push(buf.toString());
                    buf.delete(0, buf.length());
                }
            } else {
                buf.append(c);
            }
        }
        if (buf.length() > 0) {
            stack.push(buf.toString());
            buf.delete(0, buf.length());
        }
        while (!stack.empty()) {
            String word = stack.pop();
            buf.append(word);
            if (!stack.empty()) {
                buf.append(" ");
            }
        }
        return buf.toString();
    }
}
