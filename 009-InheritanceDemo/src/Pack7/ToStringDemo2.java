package Pack7;

public class ToStringDemo2 {
	public static void main(String[] args) {
		A a1 = new A();
		String s1 = a1.toString();
		System.out.println("s1 : "+s1);
		Object o1 = a1;
		String s2 = o1.toString();
		System.out.println("s2 : "+s2);
	}
}