class Stdemo6 
{
	void funT()
	{
		System.out.println(Stdemo4.x);//0
		Stdemo4 d1 = new Stdemo4();
		d1.i = d1.x+1;
		System.out.println("d1.i :: "+d1.i);//1
		d1.x = d1.i+1;
		System.out.println("d1.x :: "+d1.x);//2
	}
	public static void main(String[] args) 
	{
		//Stdemo4.x = 3;
		Stdemo6 t1 = new Stdemo6();
		t1.funT();
		Stdemo4 d1 = new Stdemo4();
		System.out.println("d1.i :: "+d1.i);//0
		System.out.println("d1.x :: "+d1.x);//2
	}
}
