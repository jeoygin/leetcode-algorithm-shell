import java.util.*;
public class Test {
	public static void main(String[] args) {
		List<String> list = new Solution().generateParenthesis(4);
		for (String e: list) {
			System.out.println(e);
		}
	}
}