public class Solution {
    public int atoi(String str) {
        int sign = 1, res = 0;
        boolean converting = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!converting) {
                if (c == '+' || c == '-') {
                    sign = c == '-' ? -1 : 1;
                    converting = true;
                } else if ( c >= '0' && c <= '9') {
                    i--;
                    converting = true;
                    continue;
                } else if (c != ' ') {
                    break;
                }
            } else {
                if (c < '0' || c > '9') {
                    break;
                }
                if (res > 214748364 || res == 214748364 && c > '7') {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                res = res * 10 + (c - '0');
            }
        }
        return sign * res;
    }
}
