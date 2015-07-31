import java.util.*;
public class Solution {
    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        Arrays.sort(S);
        dfs(0, S, new boolean[S.length], ret);
        return ret;
    }

   	void dfs(int d, int[] S, boolean[] mask, List<List<Integer>> ret) {
   		if (d == S.length) {
   			List<Integer> list = new ArrayList<Integer>();
   			for (int i = 0; i < d; i++) {
   				if (mask[i]) {
   					list.add(S[i]);
   				}
   			}
   			ret.add(list);
   		} else {
   			mask[d] = true;
   			dfs(d + 1, S, mask, ret);
   			mask[d] = false;
   			dfs(d + 1, S, mask, ret);
   		}
   	}
}
