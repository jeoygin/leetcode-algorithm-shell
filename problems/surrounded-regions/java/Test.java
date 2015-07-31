// public class Solution {
//     public void solve(char[][] board) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<char[][]>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                char[][] board = new char[][] {
                    {'X', 'X', 'X', 'X'},
                    {'X', 'O', 'O', 'X'},
                    {'X', 'X', 'O', 'X'},
                    {'X', 'O', 'X', 'X'}
                };
                new Solution().solve(board);
                char[][] ans = new char[][] {
                    {'X', 'X', 'X', 'X'},
                    {'X', 'X', 'X', 'X'},
                    {'X', 'X', 'X', 'X'},
                    {'X', 'O', 'X', 'X'}
                };
                return verifyCase(casenum, ans, board);
            }
            case 1: {
                char[][] board = new char[][] {
                    {'X', 'X', 'X'},
                    {'X', 'O', 'X'},
                    {'X', 'X', 'X'}
                };
                new Solution().solve(board);
                char[][] ans = new char[][] {
                    {'X', 'X', 'X'},
                    {'X', 'X', 'X'},
                    {'X', 'X', 'X'}
                };
                return verifyCase(casenum, ans, board);
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
