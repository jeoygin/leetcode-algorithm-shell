// /**
//  * Definition for an interval.
//  * public class Interval {
//  *     int start;
//  *     int end;
//  *     Interval() { start = 0; end = 0; }
//  *     Interval(int s, int e) { start = s; end = e; }
//  * }
//  */
// public class Solution {
//     public List<Interval> merge(List<Interval> intervals) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<Interval>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<Interval> intervals = new ArrayList<Interval>();
                return verifyCase(casenum, intervals, new Solution().merge(intervals));
            }
            case 1: {
                List<Interval> intervals = new ArrayList<Interval>();
                Collections.addAll(intervals, new Interval(1, 3), new Interval(2, 6), new Interval(8, 10), new Interval(15, 18));
                List<Interval> ans = new ArrayList<Interval>();
                Collections.addAll(ans, new Interval(1, 6), new Interval(8, 10), new Interval(15, 18));
                return verifyCase(casenum, ans, new Solution().merge(intervals));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
