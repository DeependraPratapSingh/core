public class ArrayDemo4 {
	public static void main(String[] args) {
		A a1[] = new A[5];
		System.out.println("a1 :: "+a1);
		System.out.println("a1.length :: "+a1.length);
		System.out.println("a1[0]  :: "+a1[0]);
		a1[0] = new A();
		a1[1] = new A();
		a1[2] = new A();
		a1[3] = a1[2];
		a1[2].i = 13;
		System.out.println("a1[2].i :: "+a1[2].i);
		System.out.println("a1[3].i :: "+a1[3].i);
		for (int i = 0; i < a1.length; i++) {
			System.out.println("a1["+i+"] :: "+a1[i]);
		}
		a1[0].funA();
	}
}
