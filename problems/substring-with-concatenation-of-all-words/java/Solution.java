import java.util.*;
public class Solution {
    public List<Integer> findSubstring(String S, String[] L) {
        List<Integer> res = new ArrayList<Integer>();
        if (L.length == 0) {
            return res;
        }
        int n = S.length(), m = L[0].length();
        int[] used = new int[L.length];
        for (int i = 0; i < m; i++) {
            int cnt = 0;
            Arrays.fill(used, -1);
            for (int j = i; j <= n - m; j += m) {
                String word = S.substring(j, j + m);
                int k = 0;
                for (; k < L.length; k++) {
                    if (used[k] == -1 && word.equals(L[k])) {
                        break;
                    }
                }
                if (k < L.length && used[k] == -1) {
                    used[k] = j;
                    cnt++;
                } else if (k < L.length) {
                    for (int p = 0; p < L.length; p++) {
                        if (used[p] >= 0 && used[p] < used[k]) {
                            used[p] = -1;
                            cnt--;
                        }
                    }
                    used[k] = j;
                } else {
                    int idx = j - cnt * m;
                    for (; idx < j; idx += m) {
                        if (S.substring(idx, idx + m).equals(word)) {
                            break;
                        }
                    }
                    for (int p = 0; p < L.length; p++) {
                        if (used[p] != -1 && used[p] < idx) {
                            used[p] = -1;
                            cnt--;
                        } else if (used[p] == idx) {
                            used[p] = j;
                        }
                    }
                }
                if (cnt == L.length) {
                    res.add(j - (cnt - 1) * m);
                    for (int p = 0; p < L.length; p++) {
                        if (used[p] == j - (cnt - 1) * m) {
                            used[p] = -1;
                            break;
                        }
                    }
                    cnt--;
                }
            }
        }
        return res;
    }
}
