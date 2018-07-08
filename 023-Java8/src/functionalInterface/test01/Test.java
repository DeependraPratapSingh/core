package functionalInterface.test01;

public class Test implements Interf
{
	//Without LambdaExpression
	/*public void m1(){
	 * 
		System.out.println("Hello");
	}*/

	//With LambdaExpression	
	public static void main(String[] args) {
		Interf i = () -> System.out.println("m1() implementation using Lambda Expression");
		i.m1();
		i.m2();
		Interf.m3();
	}
}