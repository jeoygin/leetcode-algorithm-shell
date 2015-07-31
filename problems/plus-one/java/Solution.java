import java.util.*;
public class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<Integer>();
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            list.add((digits[i] + carry) % 10);
            carry = (digits[i] + carry) / 10;
        }
        if (carry > 0) {
            list.add(carry);
        }
        int[] res = new int[list.size()];
        for (int i = list.size() - 1; i >= 0; i--) {
            res[list.size() - 1 - i] = list.get(i);
        }
        return res;
    }
}
