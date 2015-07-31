public class Solution {
    public String getPermutation(int n, int k) {
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = i + 1;
        }
        for (int i = 1; i < k; i++) {
            nextPermutation(num);
        }
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < n; i++) {
            buf.append(num[i]);
        }
        return buf.toString();
    }
    void nextPermutation(int[] num) {
        int p = num.length - 2;
        for (; p >= 0 && num[p] >= num[p+1]; p--);
        if (p >= 0) {
            for (int i = num.length - 1; i > p; i--) {
                if (num[i] > num[p]) {
                    swap(num, p, i);
                    break;
                }
            }
        }
        for (int i = p + 1, j = num.length - 1; i < j; i++, j--) {
            swap(num, i, j);
        }
    }
    void swap(int[] arr, int s, int d) {
        int t = arr[s];
        arr[s] = arr[d];
        arr[d] = t;
    }
}
