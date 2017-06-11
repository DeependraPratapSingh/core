public class Poly1 
{
	void fun1()
	{	
		System.out.println("from fun1()");
	}
	void fun1(int x)
	{
		System.out.println("from fun1(int x)");
	}
	void fun1(int x,int y)
	{
		System.out.println("from fun1(int x,int y)");
	}
	public static void main(String[] args) {
		Poly1 p1 = new Poly1();
		p1.fun1();
		p1.fun1(6);
		p1.fun1(7,6);
//		p1.fun1(true);
		System.out.println("Hello World");
	}
}
