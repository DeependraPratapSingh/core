class Stdemo1 
{
	int i,j;
	static int x;
	public static void main(String[] args) 
	{
		System.out.println("x :: "+x);//0
		x = 3;
		System.out.println("x :: "+x);//3
		Stdemo1 d1 = new Stdemo1();
		System.out.println(d1.i);//0
	}
}
