public class Solution {
    public int findMin(int[] num) {
 		int low = 0, high = num.length - 1, mid;
 		while (low < high) {
 			mid = (low + high) >> 1;
 			if (num[high] < num[mid]) {
 				low = mid + 1;
 			} else {
 				high = mid;
 			}
 		}
 		return num[low];
    }
}