class Odemo12 
{
	void fun1(A a1)
	{
		System.out.println(a1);
		if(a1 != null)
		{
			a1.i = a1.i+1;
			a1.j = a1.i+1;
		}
		System.out.println("End of Fun1()");
	}
	public static void main(String[] args) 
	{
		Odemo12 d1 = new Odemo12();
		A a1 = new A();
		d1.fun1(a1);
		System.out.println(a1.i);//1
		System.out.println(a1.j);//2
		d1.fun1(a1);
		System.out.println(a1.j);//3
		d1.fun1(null);
		System.out.println();
		d1.fun1(new A());
		System.out.println(a1.i);//2
	}
}
