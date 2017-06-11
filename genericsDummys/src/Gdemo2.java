public class Gdemo2<G>
{
	G g1;
	void fun1(G g1)
	{
		this.g1=g1;
	}
	G fun2()
	{
		return(g1);
	}
	public static void main(String a[])
	{
		Gdemo2<String> d1=new Gdemo2<String>();
		System.out.println(d1.g1);
		d1.fun1("abcd");
		String s1=d1.fun2();
		System.out.println("s1 :"+s1);
		System.out.println(s1.length());
		System.out.println();
		
		Gdemo2<Integer> d2=new Gdemo2<Integer>();
		d2.fun1(13);
		int i=d2.fun2();
		System.out.println("i :"+i);
 	}
}
