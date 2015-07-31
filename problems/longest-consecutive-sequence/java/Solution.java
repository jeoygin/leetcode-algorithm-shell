import java.util.*;
public class Solution {
    public int longestConsecutive(int[] num) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int d: num) {
        	map.put(d, true);
        }
        int ret = 0;
        for (int d: num) {
        	if (map.get(d) != null) {
        		int low = d, high = d + 1;
        		for (; map.get(low) != null; map.put(low--, null));
        		for (; map.get(high) != null; map.put(high++, null));
        		ret = Math.max(ret, high - low - 1);
        	}
        }
        return ret;
    }
}
