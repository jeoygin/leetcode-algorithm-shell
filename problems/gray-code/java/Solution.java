import java.util.*;
public class Solution {
    public List<Integer> grayCode(int n) {
 		List<Integer> seq = new ArrayList<Integer>();
 		seq.add(0);
 		for (int i = 0; i < n; i++) {
 			for (int j = seq.size() - 1; j >= 0; j--) {
 				seq.add((1 << i) | seq.get(j));
 			}
 		}
 		return seq;
    }
}