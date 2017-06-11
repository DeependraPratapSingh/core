class Odemo8 
{
	int x;
	A a1;
	void fun1()
	{
		x = x+1;
		//a1.i = x+1;	Null Pointer Exception
		if(a1 != null)
			a1.i = x+1;
		System.out.println("In Fun1()");
	}
	public static void main(String[] args) 
	{
		Odemo8 d1 = new Odemo8();
		d1.fun1();
		d1.a1 = new A();
		d1.fun1();
		System.out.println("d1.a1.i :: "+d1.a1.i);//3
	}
}
