import java.util.*;
public class Solution {
    public String reverseWords(String s) {
        StringBuilder buf = new StringBuilder();
        int n = s.length(), start = n + 1, end = n;
        for (int i = n - 1; i >= -1; i--) {
            char c = i >= 0 ? s.charAt(i) : ' ';
            if (c == ' ') {
                if (start <= end) {
                    buf.append(' ');
                    buf.append(s.substring(start, end));
                }
                end = i;
            } else {
                start = i;
            }
        }
        return buf.length() > 0 ? buf.substring(1) : "";
    }
}
