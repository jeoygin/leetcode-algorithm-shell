/*
public class Solution {
    public boolean search(int[] A, int target) {
        
    }
}
*/
import java.util.*;
public class Test extends TestCase<Boolean>{
    public int runTestCase(int casenum) {
        int[] arr = new int[]{4, 5, 6, 7, 0, 1, 2};
        int[] arr2 = new int[]{4, 4, 4, 4, 4, 5, 6, 1, 1, 1, 2, 3, 4, 4, 4};
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, true, new Solution().search(arr, 0));
            }
            case 1: {
                return verifyCase(casenum, true, new Solution().search(arr, 1));
            }
            case 2: {
                return verifyCase(casenum, true, new Solution().search(arr, 2));
            }
            case 3: {
                return verifyCase(casenum, false, new Solution().search(arr, 3));
            }
            case 4: {
                return verifyCase(casenum, true, new Solution().search(arr, 4));
            }
            case 5: {
                return verifyCase(casenum, true, new Solution().search(arr, 5));
            }
            case 6: {
                return verifyCase(casenum, true, new Solution().search(arr, 6));
            }
            case 7: {
                return verifyCase(casenum, true, new Solution().search(arr, 7));
            }
            case 8: {
                return verifyCase(casenum, false, new Solution().search(arr, 8));
            }
            case 9: {
                return verifyCase(casenum, true, new Solution().search(arr2, 4));
            }
            case 10: {
                return verifyCase(casenum, true, new Solution().search(arr2, 1));
            }
            case 11: {
                return verifyCase(casenum, true, new Solution().search(arr2, 2));
            }
            case 12: {
                return verifyCase(casenum, true, new Solution().search(arr2, 3));
            }
            case 13: {
                return verifyCase(casenum, true, new Solution().search(arr2, 5));
            }
            case 14: {
                return verifyCase(casenum, true, new Solution().search(arr2, 6));
            }
            case 15: {
                return verifyCase(casenum, true, new Solution().search(new int[]{3, 1}, 1));
            }
            case 16: {
                return verifyCase(casenum, true, new Solution().search(new int[]{3, 1, 1}, 3));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
