public class Solution {
    public String getPermutation(int n, int k) {
        char[] num = new char[n];
        int fact = 1;
        k--;
        for (int i = 1; i <= n; i++) {
            num[n - i] = (char)('1' + k % (fact * i) / fact);
            for (int j = n - i + 1; j < n; j++) {
                num[j] += num[j] >= num[n - i] ? 1 : 0;
            }
            fact *= i;
        }
        return new String(num);
    }
}
