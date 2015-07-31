// public class Solution {
//     public String convert(String s, int nRows) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<String>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, "PAHNAPLSIIGYIR", new Solution().convert("PAYPALISHIRING", 3));
            }
            case 1: {
                return verifyCase(casenum, "AB", new Solution().convert("AB", 1));
            }
            case 2: {
                return verifyCase(casenum, "ACB", new Solution().convert("ABC", 2));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
