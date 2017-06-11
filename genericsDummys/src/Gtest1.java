public class Gtest1 
{
	public static void main(String a[])
	{
		Gdemo2 d1=new Gdemo2();
		System.out.println(d1.g1);
		
		d1.fun1("abc");
		String s2=(String)d1.fun2();
		System.out.println(s2);

		d1.fun1(new A());
		Object o=d1.fun2();
		A a1=(A)o;
		System.out.println(a1.i);
		
		d1.fun1("abcd");
		String s1=(String)d1.fun2();
		System.out.println(s1);
	}
}