public class Poly2 
{
	void fun1(int x)
	{
		System.out.println("from fun1(int x)");
	}
	void fun1(long l)
	{
		System.out.println("from long l");
	}
	void fun1(float f)
	{
		System.out.println("from float f");
	}
	void fun1(double d)
	{
		System.out.println("from double d");
	}
	public static void main(String[] args) {
		int i = 6;
		long l = 6;
		float f = 6;
		Poly2 p1 = new Poly2();
		p1.fun1(6);
		p1.fun1(i);
		p1.fun1(l);
		p1.fun1(f);
		
	}
}
