public class Solution {
    public int findPeakElement(int[] num) {
    	int high = num.length - 1, low = 0, mid;
    	while (low <= high) {
    		mid = (low + high) / 2;
			if ((mid == 0 || num[mid] > num[mid - 1]) && 
				(mid == num.length - 1 || num[mid] > num[mid + 1])) {
				return mid;
			}    		
    		if (mid > 0 && num[mid] < num[mid - 1]) {
    			high = mid - 1;
    		} else {
    			low = mid + 1;
    		}
    	}
    	return -1;
    }
}