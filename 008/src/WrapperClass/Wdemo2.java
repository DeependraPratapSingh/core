package WrapperClass;

public class Wdemo2 {
	public static void main(String[] args) {
		Integer i1 = 13;//AutoBoxing
		System.out.println("i1 :: "+i1);
		int i2 = i1;//AutoUnboxing
		System.out.println("i2 :: "+i2);
		
		Integer i3 = 14;//AutoBoxing
		i3 = i3 * i3;//AutoUnboxing
		System.out.println("i3 :: "+i3);
	}
}
