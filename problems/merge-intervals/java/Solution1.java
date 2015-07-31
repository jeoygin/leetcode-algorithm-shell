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
    private static class Point implements Comparable<Point> {
        int pos;
        boolean start;
        Point(int pos, boolean start) {
            this.pos = pos;
            this.start = start;
        }
        public int compareTo(Point that) {
            return pos != that.pos ? pos - that.pos : start == that.start ? 0 : start ? -1 : 1;
        }
    }
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() == 0) {
            return Collections.<Interval>emptyList();
        }
        List<Interval> list = new ArrayList<Interval>();
        List<Point> points = new ArrayList<Point>();
        for (Interval interval : intervals) {
            points.add(new Point(interval.start, true));
            points.add(new Point(interval.end, false));
        }
        Collections.sort(points);
        int start = -1, cnt = 0;
        for (Point p : points) {
            if (p.start) {
                cnt++;
                if (cnt == 1) {
                    start = p.pos;
                }
            } else {
                cnt--;
                if (cnt == 0) {
                    list.add(new Interval(start, p.pos));
                }
            }
        }
        return list;
    }
}
