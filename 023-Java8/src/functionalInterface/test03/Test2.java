package functionalInterface.test03;

public class Test2 implements Interf
{
	public static void main(String[] args) {
		Interf i = () -> System.out.println("from m1 using Lambda");
		i.m1();
	}
}
