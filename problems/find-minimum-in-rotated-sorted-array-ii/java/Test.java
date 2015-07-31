// public class Solution {
//     public int findMin(int[] num) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 0, new Solution().findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
            }
            case 1: {
                return verifyCase(casenum, 1, new Solution().findMin(new int[]{3, 3, 1, 3}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
