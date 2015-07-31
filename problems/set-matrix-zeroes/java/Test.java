/*
public class Solution {
    public void setZeroes(int[][] matrix) {
        
    }
}
*/
import java.util.*;
public class Test extends TestCase<int[][]>{
    public int runTestCase(int casenum) {
        int[][] matrix = new int[][] {
            {0,0,0,5},
            {4,3,1,4},
            {0,1,1,4},
            {1,2,1,3},
            {0,0,1,1}
        };
        int[][] result = new int[][] {
            {0,0,0,0},
            {0,0,0,4},
            {0, 0, 0, 0},
            {0,0,0,3},
            {0,0,0,0}
        };
        switch(casenum) {
            case 0: {
                new Solution().setZeroes(matrix);
                return verifyCase(casenum, result, matrix);
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
