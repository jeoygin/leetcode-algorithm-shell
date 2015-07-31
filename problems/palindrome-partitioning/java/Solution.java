import java.util.*;
public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ret = new ArrayList<List<String>>();
        dfs(s.toCharArray(), 0, new LinkedList<String>(), ret);
        return ret;
    }
    void dfs(char[] chars, int s, LinkedList<String> aux, List<List<String>> ret) {
        if (s == chars.length) {
            ret.add(new ArrayList<String>(aux));
            return;
        }
        for (int i = s; i < chars.length; i++) {
            if (isPalindrome(chars, s, i)) {
                aux.offer(new StringBuilder().append(chars, s, i - s + 1).toString());
                dfs(chars, i + 1, aux, ret);
                aux.pollLast();
            }
        }

    }
    boolean isPalindrome(char[] chars, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }
}
