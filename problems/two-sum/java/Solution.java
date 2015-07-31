import java.util.*;
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i + 1);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (map.get(target - numbers[i]) != null) {
                int idx = map.get(target - numbers[i]);
                if (idx != i + 1) {
                    return new int[]{Math.min(i, idx) + 1, Math.max(i, idx)};
                }
            }
        }

        return new int[]{0, 0};
    }
}
