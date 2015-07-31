// public class Solution {
//     public boolean exist(char[][] board, String word) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Boolean>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                char[][] board = new char[][]{
                    {'A', 'B', 'C', 'E'},
                    {'S', 'F', 'C', 'S'},
                    {'A', 'D', 'E', 'E'}
                };
                return verifyCase(casenum, true, new Solution().exist(board, "ABCCED"));
            }
            case 1: {
                char[][] board = new char[][]{
                    {'A', 'B', 'C', 'E'},
                    {'S', 'F', 'C', 'S'},
                    {'A', 'D', 'E', 'E'}
                };
                return verifyCase(casenum, true, new Solution().exist(board, "SEE"));
            }
            case 2: {
                char[][] board = new char[][]{
                    {'A', 'B', 'C', 'E'},
                    {'S', 'F', 'C', 'S'},
                    {'A', 'D', 'E', 'E'}
                };
                return verifyCase(casenum, false, new Solution().exist(board, "ABCB"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
