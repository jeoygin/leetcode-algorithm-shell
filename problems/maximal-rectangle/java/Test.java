// public class Solution {
//     public int maximalRectangle(char[][] matrix) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                char[][] matrix = new char[][]{
                    {'0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0'},
                    {'0', '0', '1', '0', '0'},
                    {'0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0'}
                };
                return verifyCase(casenum, 1, new Solution().maximalRectangle(matrix));
            }
            case 1: {
                char[][] matrix = new char[][]{
                    {'0', '0', '0', '0', '0'},
                    {'1', '0', '0', '1', '0'},
                    {'1', '0', '1', '1', '0'},
                    {'1', '1', '1', '1', '0'},
                    {'0', '0', '0', '0', '0'}
                };
                return verifyCase(casenum, 4, new Solution().maximalRectangle(matrix));
            }
            case 2: {
                char[][] matrix = new char[][]{
                    {'0', '1', '0', '0', '0'},
                    {'1', '1', '0', '1', '0'},
                    {'1', '1', '0', '1', '0'},
                    {'1', '1', '1', '1', '0'},
                    {'0', '0', '0', '0', '0'}
                };
                return verifyCase(casenum, 6, new Solution().maximalRectangle(matrix));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
