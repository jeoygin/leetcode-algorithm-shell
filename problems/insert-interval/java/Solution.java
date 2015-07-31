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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> res = new ArrayList<Interval>();
        boolean inserted = false;
        for (Interval interval: intervals) {
        	if (interval.start <= newInterval.end && newInterval.start <= interval.end) {
        		newInterval.start = Math.min(newInterval.start, interval.start);
        		newInterval.end = Math.max(newInterval.end, interval.end);
        	} else {
        		if (!inserted && newInterval.start < interval.start) {
        			res.add(newInterval);
        			inserted = true;
        		}
        		res.add(interval);
        	}
        }
        if (!inserted) {
        	res.add(newInterval);
        }
        return res;
    }
}
