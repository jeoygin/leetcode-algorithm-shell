import java.util.*;
public class Solution {
    public List<String> anagrams(String[] strs) {
        List<String> ret = new ArrayList<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        boolean[] added = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            String hash = hash(strs[i]);
            if (map.get(hash) == null) {
                map.put(hash, i);
            } else {
                int idx = map.get(hash);
                if (!added[idx]) {
                    added[idx] = true;
                    ret.add(strs[idx]);
                }
                ret.add(strs[i]);
            }
        }
        return ret;
    }
    public String hash(String str) {
        int[] cnt = new int[26];
        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i) - 'a'] ++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append('a' + i);
            sb.append(cnt[i]);
        }
        return sb.toString();
    }
}
