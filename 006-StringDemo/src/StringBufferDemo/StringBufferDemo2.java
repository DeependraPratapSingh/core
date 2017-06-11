package StringBufferDemo;

public class StringBufferDemo2 {
	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println("s1 :: "+s1);
		
//		StringBuffer sb1 = "abc";
		StringBuffer sb1 = new StringBuffer("abc");
		System.out.println("sb1 :: "+sb1);
		
		StringBuffer sb2 = sb1.append('x');
		System.out.println("sb2 :: "+sb2);
//		StringBuffer sb2 = sb1 + 'x';
//		StringBuffer sb2 = sb1 + "x";
		if(sb1 == sb2)//reference comparision
			System.out.println("sb1 and sb2 are same");
		else
			System.out.println("sb1 and sb2 are not same");
	}
}
