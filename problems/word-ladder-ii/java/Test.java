// public class Solution {
//     public List<List<String>> findLadders(String start, String end, Set<String> dict) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<List<String>>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                Set<String> dict = new HashSet<String>();
                Collections.addAll(dict, "hot","dot","dog","lot","log");
                List<List<String>> ans = new ArrayList<List<String>>();
                ans.add(Arrays.asList("hit","hot","dot","dog","cog"));
                ans.add(Arrays.asList("hit","hot","lot","log","cog"));
                return verifyCase(casenum, ans, new Solution().findLadders("hit", "cog", dict));
            }
            case 1: {
                Set<String> dict = new HashSet<String>();
                Collections.addAll(dict, "hot","cog","dog","tot","hog","hop","pot","dot");
                List<List<String>> ans = new ArrayList<List<String>>();
                ans.add(Arrays.asList("hot","dot","dog"));
                ans.add(Arrays.asList("hot","hog","dog"));
                return verifyCase(casenum, ans, new Solution().findLadders("hot", "dog", dict));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
