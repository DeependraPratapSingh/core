package variableLengthArguement;

public class MainDemo1 {
	public static void main() {
		System.out.println("main()");
	}
	public static void main(int x) {
		System.out.println("main(int x)");
	}
	public static void main(int[] args) {
		System.out.println("main(int[] args)");
	}
	public static void main(String[] args) {
		main();
		main(3);
		main(new int[3]);
		Object o = new String[3];
		System.out.println(o);
	}
	public static void main(Object o) {
		System.out.println("main(Object o)");
	}
}