/*
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
    }
}
*/
import java.util.*;
public class Test extends TestCase<Boolean>{
    public int runTestCase(int casenum) {
        int[][] matrix = new int[][] {
            {1,   3,  5,  7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, true, new Solution().searchMatrix(matrix, 3));
            }
            case 1: {
                return verifyCase(casenum, true, new Solution().searchMatrix(matrix, 16));
            }
            case 2: {
                return verifyCase(casenum, true, new Solution().searchMatrix(matrix, 34));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
