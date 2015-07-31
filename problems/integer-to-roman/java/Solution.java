public class Solution {
    public String intToRoman(int num) {
        String[] roman = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] val = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < roman.length; i++) {
            while (num >= val[i]) {
                sb.append(roman[i]);
                num -= val[i];
            }        
        }
        return sb.toString();
    }
}
