// public class LRUCache {
//     
//     public LRUCache(int capacity) {
//         
//     }
//     
//     public int get(int key) {
//         
//     }
//     
//     public void set(int key, int value) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<Integer>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<Integer> ret = new ArrayList<Integer>();
                LRUCache cache = new LRUCache(3);
                cache.set(1, 1);
                cache.set(2, 2);
                cache.set(3, 3);
                ret.add(cache.get(1));
                cache.set(4, 4);
                ret.add(cache.get(2));
                return verifyCase(casenum, Arrays.asList(1, -1), ret);
            }
            case 1: {
                List<Integer> ret = new ArrayList<Integer>();
                LRUCache cache = new LRUCache(1);
                cache.set(2, 1);
                ret.add(cache.get(2));
                cache.set(3, 2);
                ret.add(cache.get(2));
                ret.add(cache.get(3));
                return verifyCase(casenum, Arrays.asList(1, -1, 2), ret);
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
