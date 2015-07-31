import java.util.*;
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] num) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        Arrays.sort(num);
        dfs(0, num, new boolean[num.length], ret);
        return ret;
    }

   	void dfs(int d, int[] num, boolean[] mask, List<List<Integer>> ret) {
   		if (d == num.length) {
   			List<Integer> list = new ArrayList<Integer>();
   			for (int i = 0; i < d; i++) {
   				if (mask[i]) {
   					list.add(num[i]);
   				}
   			}
   			ret.add(list);
   		} else {
   			mask[d] = true;
   			dfs(d + 1, num, mask, ret);
   			if (d == 0 || num[d] != num[d-1] || !mask[d-1]) {
   				mask[d] = false;
   				dfs(d + 1, num, mask, ret);	
   			}
   		}
   	}
}
