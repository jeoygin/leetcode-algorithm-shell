/*
public class Solution {
    public int[] plusOne(int[] digits) {
        
    }
}
*/
import java.util.*;
public class Test extends TestCase<int[]>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, new int[]{1, 2, 4}, new Solution().plusOne(new int[]{1, 2, 3}));
            }
            case 1: {
                return verifyCase(casenum, new int[]{1, 0, 0}, new Solution().plusOne(new int[]{9, 9}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
