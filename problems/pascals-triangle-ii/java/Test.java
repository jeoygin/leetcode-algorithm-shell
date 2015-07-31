// public class Solution {
//     public List<Integer> getRow(int rowIndex) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<Integer>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, Arrays.asList(1, 3, 3, 1), new Solution().getRow(3));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
