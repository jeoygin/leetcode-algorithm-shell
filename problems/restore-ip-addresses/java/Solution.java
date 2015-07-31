import java.util.*;
public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        search(s.toCharArray(), 0, 0, new int[4], res);
        return res;
    }
    void search(char[] ip, int start, int d, int[] aux, List<String> res) {
    	int val = 0, i = start;
    	if (d == 4) {
    		if (start == ip.length) {
    			res.add(aux[0] + "." + aux[1] + "." + aux[2] + "." + aux[3]);
    		}
    		return;
    	}
    	for (; i < ip.length; i++) {
    		val = 10 * val + (ip[i] - '0');
    		if (val > 255 || ip[start] == '0' && i != start) {
    			break;
    		}
    		aux[d] = val;
    		search(ip, i + 1, d + 1, aux, res);
    	}
    }
}
