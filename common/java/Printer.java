import java.util.*;
public class Printer {
	public static void puts(String str) {
		System.out.println(str);
	}
	
	public static void puts(int d) {
		System.out.println(d);
	}
	
	public static void p(String str) {
		System.out.print(str);
	}
	
	public static void p(int d) {
		System.out.print(d);
	}
	
	public static void p(int[] arr) {
		for (int e: arr) {
			System.out.print(e + " ");
		}
		System.out.println("");
	}
	
	public static <T> void p(T[] arr) {
		for (T e: arr) {
			System.out.print(e.toString() + " ");
		}
		System.out.println("");
	}
	
	public static <T> void p(List<T> list) {
		for (T e: list) {
			System.out.print(e.toString() + " ");
		}
		System.out.println("");
	}
}