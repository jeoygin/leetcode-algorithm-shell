// public class Solution {
//     public int jump(int[] A) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 2, new Solution().jump(new int[]{2,3,1,1,4}));
            }
            case 1: {
                return verifyCase(casenum, -1, new Solution().jump(new int[]{3,2,1,0,4}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
