public class Solution {
    public String countAndSay(int n) {
        String res = "1";
        for (int i = 1; i < n; i++) {
             StringBuilder buf = new StringBuilder();
            for (int j = 0; j < res.length(); j++) {
                int cnt = 1;
                for (;j + 1 < res.length() && res.charAt(j) == res.charAt(j + 1); j++, cnt++);
                buf.append(cnt);
                buf.append(res.charAt(j));
            }
            res = buf.toString();
        }
        return res;
    }
}
