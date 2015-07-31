// public class Solution {
//     public String largestNumber(int[] num) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<String>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, "9534330", new Solution().largestNumber(new int[]{3, 30, 34, 5, 9}));
            }
            case 1: {
                return verifyCase(casenum, "0", new Solution().largestNumber(new int[]{0, 0}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
