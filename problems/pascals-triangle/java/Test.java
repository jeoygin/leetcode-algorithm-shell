// public class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<List<Integer>>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<List<Integer>> res = new ArrayList<List<Integer>>();
                res.add(Arrays.asList(1));
                res.add(Arrays.asList(1, 1));
                res.add(Arrays.asList(1, 2, 1));
                res.add(Arrays.asList(1, 3, 3, 1));
                res.add(Arrays.asList(1, 4, 6, 4, 1));
                return verifyCase(casenum, res, new Solution().generate(5));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
