import java.util.*;
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        for (int r = 0; r <= rowIndex; r++) {
        	for (int i = r - 1; i > 0; i--) {
        		res.set(i, res.get(i) + res.get(i - 1));
        	}
        	res.add(1);
        }
        return res;
    }
}
