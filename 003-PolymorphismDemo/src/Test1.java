public class Test1 
{
	public static void main(String[] args) 
	{
//		System.out.println(3,5);
		System.out.println(3+5);	//will call println(int i)//will see data
		char ch = 'd';
		System.out.println(ch);		//will call println(char c)//will see data
		System.out.println();		//will call println()
//		System.out.print();
		String s1 = new String("deependra");
		System.out.println(s1);		//will call println(String s)//will see data
		A a1 = new A();
		System.out.println(a1);		//will call println(Object obj)
		//will see address because we are passing object of userdefined class to the println() method.
		Thread t1 = new Thread();
		System.out.println(t1);		//will call println(Object obj)
		//will see data because we are passing object of library class to println() method.
		Integer i1 = new Integer(133);
		System.out.println(i1);		//will call println(Object obj)
		//will see data because we are passing object of library class to println() method.
		System.out.println(System.out);//will call println(Object obj)
	}
}