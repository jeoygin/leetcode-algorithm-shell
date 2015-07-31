import java.util.*;
public class Solution {
    private Map<Character, String> map;

    public List<String> letterCombinations(String digits) {
        map = new HashMap<Character, String>() {
            {
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
                put('0', " ");
            }
        };
        List<String> ret = new ArrayList<String>();
        dfs(digits, 0, new char[digits.length()], ret);
        return ret;
    }
    void dfs(String digits, int d, char[] aux, List<String> ret) {
        if (d == digits.length()) {
            ret.add(new String(aux));
            return;
        }
        String letters = map.get(digits.charAt(d));
        for (char c: letters.toCharArray()) {
            aux[d] = c;
            dfs(digits, d + 1, aux, ret);
        }
    }
}
