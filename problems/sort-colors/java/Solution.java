public class Solution {
    public void sortColors(int[] A) {
        int n = A.length, t;
        int ir = -1, ib = n, i = 0;
        while (i < ib) {
        	if (A[i] == 0) {
        		swap(A, ++ir, i);
        	} else if (A[i] == 2) {
        		swap(A, i, --ib);
        	} 
        	if (ir == i || A[i] == 1) {
        		i++;
        	}
        }
    }
    private void swap(int[] arr, int i, int j) {
    	int t = arr[i];
    	arr[i] = arr[j];
    	arr[j] = t;
    }
}