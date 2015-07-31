import java.util.*;
public class Solution {
    public List<List<Integer>> permute(int[] num) {
		int n = num.length, i, j, k;
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for (int d: num) {
			list.add(d);
		}
		Collections.sort(list);
		res.add(new ArrayList(list));
		do {
			for (i = n - 1; i > 0 && list.get(i) < list.get(i-1); i--);
			if (i > 0) {
				for (j = i; j < n && list.get(j) > list.get(i-1); j++);
				Collections.swap(list, i - 1, j - 1);
				for (j = i, k = n - 1; j < k; j++, k--) {
					Collections.swap(list, j, k);
				}
				res.add(new ArrayList(list));
			}
		} while (i > 0);
		return res;
    }
}
