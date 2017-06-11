class Stdemo4 
{
	int i,j;
	static int x;
	static void fun1()
	{
		x = x+1;
		Stdemo4 d1 = new Stdemo4();
		d1.i = x+1;
	}
	void fun2()
	{
		i = i+1;
		x = x+1;
	}
	public static void main(String[] args) 
	{
		x = 3;
		fun1();
		Stdemo4 d1 = new Stdemo4();
		d1.fun2();
		d1.fun1();
		System.out.println("d1.i :: "+d1.i);
		System.out.println("d1.x :: "+d1.x);
		System.out.println("x :: "+x);
	}
}
