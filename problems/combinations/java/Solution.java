import java.util.*;
public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        search(1, n, k, 0, new ArrayList<Integer>(k), res);
        return res;
    }

    private void search(int from, int to, int k, int d, List<Integer> aux, List<List<Integer>> res) {
    	if (d == k) {
    		res.add(new ArrayList<Integer>(aux));
    		return;
    	}
    	for (int i = from; i <= to && to - i >= k - d - 1; i++) {
    		if (aux.size() == d) {
    			aux.add(i);
    		}
    		aux.set(d, i);
    		search(i + 1, to, k, d + 1, aux, res);
    	}
    }
}
