/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
import java.util.*;
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() == 0) {
            return Collections.<Interval>emptyList();
        }
        List<Interval> list = new ArrayList<Interval>();
        int n = intervals.size();
        int[] start = new int[n], end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int from = -1, cnt = 0, ps = 0, pe = 0;
        while (pe < n) {
            if (ps < n && start[ps] <= end[pe]) {
                if (cnt == 0) {
                    from = start[ps];
                }
                cnt++;
                ps++;
            } else {
                if (cnt == 1) {
                    list.add(new Interval(from, end[pe]));
                }
                cnt--;
                pe++;
            }
        }
        return list;
    }
}