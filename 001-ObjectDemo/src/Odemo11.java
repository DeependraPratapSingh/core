class Odemo11 
{
	void fun1(int x)
	{
		//int x = 1;
		int sqr = x*x;
		System.out.println("sqr :: "+sqr);
	}
	public static void main(String[] args) 
	{
		Odemo11 d1 = new Odemo11();
		d1.fun1(3); //Pass by Value
		//d1.fin1(a1);  Pass by Reference
		System.out.println("main ended!");
	}
}
