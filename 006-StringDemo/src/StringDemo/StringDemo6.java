package StringDemo;

public class StringDemo6 {
	public static void main(String[] args) {
		String s1 = new String("ycncm!");
		String s2 = new String("ycncm!");
		System.out.println(s1 == s2);//false
		String s3 = new String("ycncm!");
		String s4 = new String("ycncm!");
		System.out.println(s1 == s4);//false
		System.out.println(s1 == s3);//false
	}
}
