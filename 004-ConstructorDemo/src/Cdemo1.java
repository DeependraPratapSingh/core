public class Cdemo1 
{
	public Cdemo1() 
	{
		System.out.println("from Constructor");
	}
	void fun1()
	{
		System.out.println("from fun1");
	}
	public static void main(String[] args) 
	{
		Cdemo1 d1 = new Cdemo1();
		System.out.println("d1 :: "+d1);
//		d1.Cdemo1();
//		Cdemo1 d1 = new Cdemo1();
		Cdemo1 d2 = new Cdemo1();
		System.out.println("d2 :: "+d2);
	}
}
