import java.util.*;
public class Solution {
    public List<String> fullJustify(String[] words, int L) {
        List<String> res = new ArrayList<String>();
        int from = 0, len = 0;
        for (int i = 0; i < words.length; i++) {
        	int to = -1;
        	if (len > 0 && len + words[i].length() + 1 > L) {
        		to = i - 1;
        	} else {
        		len += words[i].length() + (i != from ? 1 : 0);
        		if (i == words.length - 1) {
        			to = i;
        		} 
        	}
        	if (to >= from) {
        		StringBuilder sb = new StringBuilder();
        		int totalSpaces = L - len + to - from;
        		int insideSpaces = to != words.length - 1 && to != from ? totalSpaces : to - from, extra = totalSpaces - insideSpaces;

        		for (int j = from; j <= to; j++) {
        			if (j > from) {
        				int spaces = insideSpaces / (to - from), left = insideSpaces % (to - from);
        				for (int k = (j - from) <= left ? 0 : 1; k <= spaces; k++) {
        					sb.append(' ');
        				}
        			}
        			sb.append(words[j]);
        		}
        		for (int k = 0; k < extra; k++) {
        			sb.append(' ');
        		}
        		
        		res.add(sb.toString());
        		from = to + 1;
        		len = 0;
        		i = to;
        	}
        }
        return res;
    }
}
