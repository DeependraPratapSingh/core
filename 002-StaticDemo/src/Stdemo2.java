class Stdemo2 
{
	int i,j;
	static int x;
	static void fun1()
	{
		x= x+1;
		Stdemo2 d1 = new Stdemo2();
		d1.i = x+1;
	}
	public static void main(String[] args) 
	{
		x = 3;
		fun1();
		Stdemo2 d1 = new Stdemo2();
		System.out.println("d1.i :: "+d1.i);
		fun1();
		System.out.println("d1.i :: "+d1.i);
		System.out.println("x :: "+x);
	}
}
