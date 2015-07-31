import java.util.*;
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>[] arr = new List[n+1];
        arr[0] = Arrays.asList("");
        for (int i = 1; i <= n; i++) {
        	arr[i] = new ArrayList<String>();
        	for (int j = 0; (j << 1) < i; j++) {
        		for (String left: arr[j]) {
        			for (String right: arr[i - j - 1]) {
        				arr[i].add("(" + left + ")" + right);
        				if (i != (j << 1 | 1)) {
        					arr[i].add("(" + right + ")" + left);
        				}
        			}
        		}
        	}
        }
        return arr[n];
    }
}