import java.util.*;
public class Test {
	public static void main(String[] args) {
		List<Integer> seq = new Solution().grayCode(3);
		for (int i: seq) {
			System.out.println(i);
		}
	}
}