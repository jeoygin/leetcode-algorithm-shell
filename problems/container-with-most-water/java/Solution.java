import java.util.*;
public class Solution {
    public int maxArea(int[] height) {
		int left = 0, right = height.length - 1, res = 0;
		while (left < right) {
			res = Math.max(res, (right - left) * Math.min(height[left], height[right]));
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
        return res;
    }
}
