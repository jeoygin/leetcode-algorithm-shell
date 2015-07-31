public class Solution {
    public int majorityElement(int[] num) {
        int counter = 0, candidate = 0;
        for (int d: num) {
            if (counter == 0) {
                candidate = d;
                counter++;
            } else if (d == candidate) {
                counter++;
            } else {
                counter--;
            }
        }
        return candidate;
    }
}
