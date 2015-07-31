import java.util.*;
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (numRows > 0) {
        	res.add(Arrays.asList(1));	
        }
        for (int i = 1; i < numRows; i++) {
        	List<Integer> row = new ArrayList<Integer>();
        	row.add(1);
        	for (int j = 1; j < i; j++) {
        		row.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
        	}
        	row.add(1);
        	res.add(row);
        }
        return res;
    }
}
