public class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length() + 1, m = p.length() + 1, si = 0, pi = 0, last = -1;
        String ss = s + "#", pp = p + "#";
        while (si < n && pi < m) {
            if (pp.charAt(pi) == '?' || pp.charAt(pi) == ss.charAt(si)) {
                si++;
                pi++;
            } else if (pp.charAt(pi) == '*') {
                last = pi++;
            } else {
                if (last == -1) {
                    return false;
                } else if (pi == last + 1) {
                    si++;
                } else {
                    int firstIndex = pi - 1;
                    for (; firstIndex > last && pp.charAt(firstIndex) != ss.charAt(si) 
                        && pp.charAt(firstIndex) != '?'; firstIndex--);
                    if (firstIndex > last && pp.charAt(firstIndex) == ss.charAt(si) || pp.charAt(firstIndex) == '?') {
                        si -= firstIndex - last - 1;
                        pi = last + 1;
                    } else {
                        si++;
                        pi = last + 1;
                    }
                }
            }
        }
        return si == n && pi == m;
    }
}
