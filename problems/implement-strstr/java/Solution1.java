public class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            boolean got = true;
            for (int j = 0; j < m; j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    got = false;
                    break;
                }
            }
            if (got) {
                return i;
            }
        }
        return -1;
    }
}
