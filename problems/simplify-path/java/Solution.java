import java.util.*;
public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        int start = 0;
        for (int i = 0; i <= path.length(); i++) {
        	if (i == path.length() || path.charAt(i) == '/') {
        		String name = path.substring(start, i);
        		if (name.equals("..")) {
        			if (!stack.empty()) {
        				stack.pop();
        			}
        		} else if (name.length() > 0 && !name.equals(".")) {
        			stack.push(name);
        		}
        		start = i + 1;
        	}
        }
        StringBuilder sb = new StringBuilder();
        for (String name : stack) {
        	sb.append("/" + name);
        }
        return sb.length() > 0 ? sb.toString() : "/";
    }
}
