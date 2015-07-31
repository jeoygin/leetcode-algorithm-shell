import java.util.*;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] idx = new int[256];
        int start = 0, len = 0;
        Arrays.fill(idx, -1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (idx[c] == -1) {
                idx[c] = i;
            } else {
                for (; start <= idx[c]; start++) {
                    idx[s.charAt(start)] = -1;
                }
                idx[c] = i;
            }
            len = Math.max(len, i - start + 1);
        }
        return len;
    }
}
