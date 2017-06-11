class Stdemo3 
{
	int i,j;
	static int x;
	public static void main(String[] args) 
	{
		Stdemo3 d1 = new Stdemo3();
		Stdemo3 d2 = new Stdemo3();
		Stdemo3 d3 = new Stdemo3();
		Stdemo3 d4 = null;
		d1.i = 1;
		d2.i = 2;
		d3.i = 3;
		//d4.i = 4;	Null Pointer Exception
		x = 13;
		System.out.println("d1.i :: "+d1.i);
		System.out.println("d2.i :: "+d2.i);
		System.out.println("d3.i :: "+d3.i);
		//System.out.println("d4.i :: "+d4.i);	Null Pointer Exception
		System.out.println("x :: "+x);
		System.out.println("d1.x :: "+d1.x);
		System.out.println("d2.x :: "+d2.x);
		System.out.println("d3.x :: "+d3.x);
		System.out.println("d4.x :: "+d4.x);
	}
}
