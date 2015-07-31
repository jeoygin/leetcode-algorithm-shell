public class Solution {
    public int search(int[] A, int target) {
        int low = 0, high = A.length - 1, mid;
		while (low < high) {
			mid = (high + low) >> 1;
			if (A[mid] == target) {
                return mid;
            } else if (target > A[mid]) {
            	if (target <= A[high] || A[high] < A[mid]) {
            		low = mid + 1;
            	} else {
            		high = mid;
            	}
            } else {
            	if (target >= A[low] || A[low] > A[mid]) {
            		high = mid;
            	} else {
            		low = mid + 1;
            	}
            }
		}
		return A[low] == target ? low : -1;
    }
}