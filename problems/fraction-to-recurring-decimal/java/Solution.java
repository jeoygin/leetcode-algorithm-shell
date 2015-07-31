import java.util.*;
public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder buf = new StringBuilder();
        if (numerator < 0 ^ denominator < 0) {
            buf.append("-");
        }
        long n = Math.abs((long)numerator), d = Math.abs((long)denominator);
        buf.append(n / d);
        if (n % d > 0) {
            buf.append(".");
        }
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        for (long mod = n % d; mod > 0; mod %= d) {
            if (map.get(mod) != null) {
                buf.insert(map.get(mod), "(");
                buf.append(")");
                break;
            }
            map.put(mod, buf.length());
            mod *= 10;
            buf.append(mod / d);
        }
        return buf.toString();
    }
}
