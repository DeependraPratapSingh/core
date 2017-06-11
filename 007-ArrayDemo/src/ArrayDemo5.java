public class ArrayDemo5 {
	public static void main(String[] args) {
		String s1[] = new String[4];
		System.out.println("s1 :: "+s1);
		System.out.println("s1.length :: "+s1.length);
		System.out.println("s1[0] :: "+s1[0]);
		s1[0] = "example";
		s1[1] = "john";
		s1[2] = "smith";
		s1[3] = s1[2];
		System.out.println("s1[s1.length-1] :: "+s1[s1.length-1]);
		System.out.println("s1[0] :: "+s1[0]);
		System.out.println("s1[0].charAt(0) :: "+s1[0].charAt(0));
		
		String s2[] = {"abc","ijkl","1234"};
		System.out.println("s2 :: "+s2);
		System.out.println("s2.length :: "+s2.length);
		for (int i = 0; i < s2.length; i++) {
			System.out.println("s2["+i+"] :: "+s2[i]);
		}
		
		A a1[] = {new A(), new A(), new A()};
		System.out.println("a1 :: "+a1);
		a1[0].i = 12;
		a1[0].funA();
		
		A a2[] = {};
//		a2[0].i;
	}
}