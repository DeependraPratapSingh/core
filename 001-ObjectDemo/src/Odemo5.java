class Odemo5 
{
	int x = 3;
	A a1 = new A();
	public static void main(String[] args) 
	{
		Odemo5 d1 = new Odemo5();
		System.out.println("from d1.x :: "+d1.x);//3
		System.out.println("from d1.a1 :: "+d1.a1);//A@6bbc4459
		System.out.println("from d1.a1.i :: "+d1.a1.i);//0
		d1.a1.funA();//from class A
	}
}
