package pack4;

public class Edemo5 {
	public void fun1() throws ArithmeticException
	{
		System.out.println("fun1() of Edemo5");
	}
	public void fun2() throws ClassNotFoundException
	{
		System.out.println("fun2() of Edemo5");
	}
	/*public void fun3(){
		System.out.println("fun3() of Edemo5");
	}*/
	public void fun3() throws Exception
	{
		System.out.println("fun3() of Edemo5");
	}
	public static void main(String[] args) {
		Edemo5 e1 = new Edemo5();
		e1.fun1();// No compilation Error because AE is subclass of RuntimeException 
		try {
			e1.fun2();//CE because CNFE is not subclass of RuntimeException
		} catch (ClassNotFoundException c1) {
			System.out.println(c1);
		}
		try {
			e1.fun3();//CE because Exception is not subclass of RuntimeException so it's a checked exception
		} catch (Exception c2) {
			c2.printStackTrace();
		}
	}
}