package StringDemo;
public class StringDemo3 
{
	public static void main(String[] args) {
		String s1 = "6" + 6;
		System.out.println(s1);
		
		String s2 = "abc" + "xyz";
		System.out.println(s2);
		
		String s3 = "ijk";
		String s4 = "pqr";
		String s5 = s3 + s4;
//		String s5 = "ijk" + "pqr";
		System.out.println(s5);
		System.out.println("s5 :: "+s5);
		
		System.out.println(2+3);
		
		int x = 13;
		String s6 = x+"";
		System.out.println("s6 :: "+s6);
		
		float sal = 8900;
		String s7 = sal+"";
		System.out.println(s7);
		
		System.out.println();
		
		String s = "def";
		System.out.println("s :: "+s);
		s = s+"g";//here content of object is not changing, content of reference variable is changing(meaning address is changing not the data).
		System.out.println("s :: "+s);
	}
}
