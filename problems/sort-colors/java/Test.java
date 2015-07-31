public class Test {
	public static void main(String[] args) {
		int[] arr = new int[]{0, 1, 2, 0, 1, 2};
		new Solution().sortColors(arr);
		for (int d: arr) {
			System.out.print(d + " ");
		}
		System.out.println("");
	}
}