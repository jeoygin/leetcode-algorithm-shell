// public class Solution {
//     public int largestRectangleArea(int[] height) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 0, new Solution().largestRectangleArea(new int[]{}));
            }
            case 1: {
                return verifyCase(casenum, 10, new Solution().largestRectangleArea(new int[]{2,1,5,6,2,3}));
            }
            
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
