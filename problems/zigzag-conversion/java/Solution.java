public class Solution {
    public String convert(String s, int nRows) {
        if (nRows == 1) {
            return s;
        }
        StringBuilder buf = new StringBuilder();
        for (int r = 0; r < nRows; r++) {
            for (int i = 0; ; i += r > 0 && r < nRows - 1 ? 1 : 2) {
                int p = i % 2 == 0 ? (nRows - 1) * i + r : (nRows - 1) * i + nRows - 1 - r;
                if (p >= s.length()) {
                    break;
                }
                buf.append(s.charAt(p));
            }
        }
        return buf.toString();
    }
}
