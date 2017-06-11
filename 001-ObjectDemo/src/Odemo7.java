class Odemo7 
{
	int x;
	A a1;
	public static void main(String[] args) 
	{
		Odemo7 d1 = new Odemo7();
		//d1.a1.i = 7; null pointer exception
		d1.a1 = new A();
		d1.a1.i = 7;
		System.out.println("d1.a1.i :: "+d1.a1.i);//7
		System.out.println("Hello World!");
	}
}
