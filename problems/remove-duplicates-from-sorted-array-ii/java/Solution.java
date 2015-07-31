public class Solution {
    public int removeDuplicates(int[] A) {
        int len = 0, val = A.length > 0 ? A[0] - 1 : 0;
        for (int i = 0; i < A.length; i++) {
        	if (A[i] != val) {
        		val = A[i];
        		A[len++] = val;
        		if (i + 1 < A.length && A[i+1] == A[i]) {
        			A[len++] = val;
        			i++;
        		}
        	}
        }
        return len;
    }
}
