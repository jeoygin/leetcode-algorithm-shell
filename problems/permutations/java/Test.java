import java.util.*;
public class Test {
    public static void main(String[] args) {
        for (List<Integer> list: new Solution().permute(new int[]{1, 2, 3})) {
        	for (int d: list) {
        		System.out.print(d + " ");
        	}
			System.out.println();
        }
    }
}
