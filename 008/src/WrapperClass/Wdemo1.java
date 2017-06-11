package WrapperClass;

public class Wdemo1 {
	public static void main(String[] args) {
		int i = 116;
		Integer i1 = new Integer(i);
		System.out.println("i1 :: "+i1);
		int i2 = i1.intValue();
		i2 = i2 * i2;
		System.out.println("i2 :: "+i2);
		
		String s = "13";
		Integer s1 = new Integer(s);
		System.out.println("s1 :: "+s1);
		int s2 = s1.intValue();
		s2 = s2+1;
		System.out.println("s2 :: "+s2);
		
		String s3 = "17";
		int s4 = Integer.parseInt(s3);
		System.out.println("s4 :: "+s4);
	}
}
