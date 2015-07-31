import java.util.*;
public class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length(), j, k;
        boolean[] bad = new boolean[256];
        Arrays.fill(bad, true);
        for (int i = 0; i < m; i++) {
            bad[needle.charAt(i)] = false;
        }
        for (int i = 0; i <= n - m;) {
            for (j = m - 1; j >= 0 && haystack.charAt(i+j) == needle.charAt(j); j--);
            if (j < 0) {
                return i;
            } else {
                if (bad[haystack.charAt(i+j)]) {
                    i += j + 1;
                } else {
                    for (k = j - 1; k >= 0 && haystack.charAt(i+j) != needle.charAt(k); k--);
                    i += j - k;
                }
            }
        }
        return -1;
    }
}
