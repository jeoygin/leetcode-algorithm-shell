public class Solution {
    public void nextPermutation(int[] num) {
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
