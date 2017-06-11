class Odemo3
{
	int a,b;
	void funT()
	{
		a = a+1;
		A a1 = new A();
		a1.i = a+1;
		System.out.println("a1.i from method funT ::"+a1.i);//5
	}
	public static void main(String a[])
	{
		Odemo3 d1 = new Odemo3();
		d1.a = 3;
		d1.funT();
		System.out.println(d1.a);//4
		A a1 = new A();
		System.out.println(a1.i);//0
	}
}