public class Poly3 
{
	void fun1(A a1)
	{
		System.out.println("fun1(A a1)");
	}
	void fun1(B b1)
	{
		System.out.println("fun1(B b1)");
	}
	void fun1(C c1)
	{
		System.out.println("fun1(C c1)");
	}
	public static void main(String[] args) {
		Poly3 p1 = new Poly3();
		p1.fun1(new A());
		p1.fun1(new B());
		p1.fun1(new C());
//		p1.fun1(null);  //ambiguous condition
	}
}
