import java.util.*;
public class Solution {
    public String minWindow(String S, String T) {
        int[] cnt = new int[256];
        for (char c : T.toCharArray()) {
            cnt[c]++;
        }
        List<Integer> valids = new ArrayList<Integer>();
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > 0) {
                valids.add(i);
            }
        }
        int len = Integer.MAX_VALUE, start = 0, l = 0, r = -1;
        while (r < S.length()) {
            boolean valid = true;
            for (int c : valids) {
                if (cnt[c] > 0) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                if (len > r - l + 1) {
                    len = r - l + 1;
                    start = l;
                }
                cnt[S.charAt(l++)]++;
            } else {
                r++;
                if (r < S.length()) {
                    cnt[S.charAt(r)]--;
                }
            }
        }
        return len < Integer.MAX_VALUE ? S.substring(start, start + len) : "";
    }
}
