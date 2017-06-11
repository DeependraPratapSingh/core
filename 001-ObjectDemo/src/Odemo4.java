class Odemo4 
{
	int x,y;
	void fun1()
	{
		Odemo4 d1 = new Odemo4();
		d1.x = 13;
		System.out.println("from fun1() method :: "+d1.x);//13
	}
	public static void main(String[] args)
	{
		Odemo4 d1 = new Odemo4();
		d1.fun1();
		System.out.println("from main method :: "+d1.x);//0
	}
}