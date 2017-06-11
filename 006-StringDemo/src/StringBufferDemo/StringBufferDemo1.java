package StringBufferDemo;
import StringDemo.A;

public class StringBufferDemo1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(13);
		System.out.println("i1 :: "+i1);
		Thread t1 = new Thread();
		System.out.println("t1 :: "+t1);
		A a1 =  new A();
		System.out.println("a1 :: "+a1);
		String s1 = "abc";
		System.out.println("s1 :: "+s1);
		
//		StringBuffer s2 = "abc";
		StringBuffer s2 = new StringBuffer("abc");
		System.out.println("s2 :: "+s2);
		StringBuffer s3 = s2.append('d');
		System.out.println("s1 :: "+s1);
		System.out.println("s3 :: "+s3);
		if(s2 == s3)
			System.out.println("s2 and s3 are same");
		else
			System.out.println("s2 and s3 are not same");
		
		StringBuilder s4 = new StringBuilder();
		System.out.println("s4 :: "+s4);
		StringBuilder s5 = s4.append('3');
		System.out.println("s5 :: "+s5);
	}
}
