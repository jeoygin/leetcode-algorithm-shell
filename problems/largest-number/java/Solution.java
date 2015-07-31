import java.util.*;
public class Solution {
    public String largestNumber(int[] num) {
    	Integer[] arr = new Integer[num.length];
    	for (int i = 0; i < num.length; i++) {
    		arr[i] = num[i];
    	}
        Arrays.sort(arr, new Comparator<Integer>() {
        	public int compare(Integer i1, Integer i2) {
        		long l1 = Long.parseLong(String.valueOf(i1).concat(String.valueOf(i2)));
        		long l2 = Long.parseLong(String.valueOf(i2).concat(String.valueOf(i1)));
        		return Long.compare(l2, l1);
        	}
        });
        StringBuilder sb = new StringBuilder();
        for (int d : arr) {
        	sb.append(d);
        }
        int offset = 0;
        for (; offset < sb.length() - 1 && sb.charAt(offset) == '0'; offset++);
        return sb.substring(offset);
    }
}
