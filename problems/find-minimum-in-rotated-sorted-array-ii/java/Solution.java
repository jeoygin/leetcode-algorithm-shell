public class Solution {
    public int findMin(int[] num) {
        int low = 0, high = num.length - 1, mid;
        while (low < high) {
        	mid = (low + high) >> 1;
        	if (num[mid] > num[high] ) {
        		low = mid + 1;
        	} else if (num[mid] == num[high]) {
        		if (num[low] < num[mid]) {
        			high = mid;
        		} else {
        			low++;
        		}
        	} else {
        		high = mid;
        	}
        }
        return num[low];
    }
}
