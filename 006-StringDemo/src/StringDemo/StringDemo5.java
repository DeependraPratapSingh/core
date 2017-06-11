package StringDemo;
public class StringDemo5 {
	public static void main(String[] args) {
		String sql1 = "insert into emp values(100,'john',7000)";
		int size = sql1.length();
		System.out.println("size :: "+size);
		
		String s1 = "abcd ";
		String s2 = s1.trim();
		System.out.println("*****"+s1+"*****");
		System.out.println("*****"+s2+"*****");
		
		boolean fl1 = s1.contentEquals(s2);
		System.out.println("fl1 :: "+fl1);
		
		String s3 = "ABC";
		String s4 = "abc";
		boolean fl2 = s3.equals(s4);
		System.out.println("fl2 :: "+fl2);
		boolean fl3 = s3.equalsIgnoreCase(s4);
		System.out.println("fl3 :: "+fl3);
	}
}
