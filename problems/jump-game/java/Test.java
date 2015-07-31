// public class Solution {
//     public boolean canJump(int[] A) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Boolean>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, true, new Solution().canJump(new int[]{2,3,1,1,4}));
            }
            case 1: {
                return verifyCase(casenum, false, new Solution().canJump(new int[]{3,2,1,0,4}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
