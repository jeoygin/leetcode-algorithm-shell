public class Solution {
    void swap(int[] A, int i, int j) {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }
    public int removeElement(int[] A, int elem) {
        int head = 0, tail = A.length - 1;
        while (head <= tail) {
            if (A[head] == elem) {
                swap(A, head, tail);
                tail--;
            } else {
                head++;
            }
        }
        return head;
    }
}
