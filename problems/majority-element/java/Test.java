// public class Solution {
//     public int majorityElement(int[] num) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 12384, new Solution().majorityElement(new int[]{12384, 1, 2, 12384, 12384}));
            }
            case 1: {
                return verifyCase(casenum, -2147483648, new Solution().majorityElement(new int[]{-2147483648}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
