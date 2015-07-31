// public class Solution {
//     public int minimumTotal(List<List<Integer>> triangle) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<List<Integer>> triangle = new ArrayList<List<Integer>>();
                triangle.add(Arrays.asList(2));
                triangle.add(Arrays.asList(3, 4));
                triangle.add(Arrays.asList(6, 5, 7));
                triangle.add(Arrays.asList(4, 1, 8, 3));
                return verifyCase(casenum, 11, new Solution().minimumTotal(triangle));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
