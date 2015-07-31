import java.util.*;
public class Solution {
    List<String>[] dp;
    public List<String> wordBreak(String s, Set<String> dict) {
        int n = s.length();
        dp = new List[n];
        return search(s, 0, dict);
    }
    List<String> search(String s, int start, Set<String> dict) {
        if (dp[start] != null) {
            return dp[start];
        }
        List<String> list = new ArrayList<String>();
        dp[start] = list;
        for (String word: dict) {
            int m = word.length();
            if (start + m <= s.length() && s.substring(start, start + m).equals(word)) {
                if (start + m == s.length()) {
                    list.add(word);
                } else {
                    List<String> ret = search(s, start + m, dict);
                    for (String seq: ret) {
                        list.add(word + " " + seq);
                    }
                }
            }
        }
        return list;
    }
}
