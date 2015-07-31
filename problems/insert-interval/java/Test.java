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
//     public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<Interval>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<Interval> intervals = new ArrayList<Interval>();
                Collections.addAll(intervals, new Interval(1, 2), 
                    new Interval(3, 5), new Interval(6, 7), 
                    new Interval(8, 10), new Interval(12, 16));
                List<Interval> ans = new ArrayList<Interval>();
                Collections.addAll(ans, new Interval(1, 2), 
                    new Interval(3, 10), new Interval(12, 16));
                return verifyCase(casenum, ans, new Solution().insert(intervals, new Interval(4, 9)));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
