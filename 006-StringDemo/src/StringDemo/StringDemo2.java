package StringDemo;
public class StringDemo2 
{
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "xyz";
		if(s1 == s2)
			System.out.println("s1 and s2 are same");
		else
			System.out.println("s1 and s2 are not same");
		
		String s3 = new String("abc");
		if(s3 == s1)
			System.out.println("s3 and s1 are same");
		else
			System.out.println("s3 and s1 are not same");
		
		String s4 = "abc";
		if(s4 == s1)
			System.out.println("s4 and s1 are same");
		else
			System.out.println("s4 and s1 are not same");
	}
}
