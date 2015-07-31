// public class Solution {
//     public List<List<Integer>> subsets(int[] S) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<List<Integer>>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<List<Integer>> res = new ArrayList<List<Integer>>();
                res.add(Arrays.asList(1, 2, 3));
                res.add(Arrays.asList(1, 2));
                res.add(Arrays.asList(1, 3));
                res.add(Arrays.asList(1));
                res.add(Arrays.asList(2, 3));
                res.add(Arrays.asList(2));
                res.add(Arrays.asList(3));
                res.add(new ArrayList<Integer>());
                
                return verifyCase(casenum, res, new Solution().subsets(new int[]{1, 2, 3}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
