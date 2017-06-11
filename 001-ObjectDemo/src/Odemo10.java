class Odemo10 
{
	int x = 3;
	A a1 = new A();
	Odemo10 d1;
	public static void main(String[] args) 
	{
		Odemo10 d1 = new Odemo10();
		System.out.println("d1.x :: "+d1.x);//3
		d1.d1 = new Odemo10();
		System.out.println("d1.d1.x :: "+d1.d1.x);//3
		d1.d1.d1 = new Odemo10();
		System.out.println("d1.d1.d1.x :: "+d1.d1.d1.x);//3
		int x = 13;
		d1.d1.d1.x = x;
		System.out.println("d1.d1.d1.x :: "+d1.d1.d1.x);//13
		d1.d1.d1.d1 = d1;
		System.out.println("d1.d1.d1.d1.x :: "+d1.d1.d1.d1.x);//3
		d1.d1.d1.d1.x = 26;
		System.out.println("d1.d1.d1.d1.x :: "+d1.d1.d1.d1.x);//26
	}
}
