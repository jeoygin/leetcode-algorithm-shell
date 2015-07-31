import java.util.*;
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int[] sortedCandidates = Arrays.copyOf(candidates, candidates.length);
        Arrays.sort(sortedCandidates);
        search(sortedCandidates, target, 0, new LinkedList<Integer>(), ret);
        return ret;
    }
    void search(int[] candidates, int target, int start, LinkedList<Integer> aux, List<List<Integer>> ret) {
        if (target == 0) {
            List<Integer> list = new ArrayList<Integer>(aux);
            ret.add(list);
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                aux.offer(candidates[i]);
                search(candidates, target - candidates[i], i, aux, ret);
                aux.pollLast();
            }
        }
    }
}
