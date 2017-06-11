public class Odemo1 
{
	public static void main(String a[])
	{
		A a1=new A();
		A a2=new A();
		A a3=new A();
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
		System.out.println();
		a1.i=3;
		a2.i=8;
		a3.i=13;
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
		a2.funA();
		System.out.println();
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
		System.out.println();
		if(a1.i==a2.i)
			System.out.println("a1.i==a2.i");
		else
			System.out.println("a1.i!=a2.i");
		System.out.println();
		if(a1==a2)
			System.out.println("a1==a2");
		else
			System.out.println("a1!=a2");
	}
}
