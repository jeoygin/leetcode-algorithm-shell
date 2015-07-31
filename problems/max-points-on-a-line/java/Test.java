// /**
//  * Definition for a point.
//  * class Point {
//  *     int x;
//  *     int y;
//  *     Point() { x = 0; y = 0; }
//  *     Point(int a, int b) { x = a; y = b; }
//  * }
//  */
// public class Solution {
//     public int maxPoints(Point[] points) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 3, new Solution().maxPoints(new Point[]{new Point(0, 1), new Point(0, 2), new Point(0, 3)}));
            }
            case 1: {
                return verifyCase(casenum, 4, new Solution().maxPoints(new Point[]{new Point(1, 1), new Point(1, 1), new Point(2, 2), new Point(2, 2)}));
            }
            case 2: {
                return verifyCase(casenum, 3, new Solution().maxPoints(new Point[]{new Point(2, 3), new Point(3, 3), new Point(-5, 3)}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
