public class Gdemo1<T>
{
	T x;
	public static void main(String a[])
	{
		Gdemo1<A> d1=new Gdemo1<A>();
		d1.x=new A();
		System.out.println(d1.x.i);
		d1.x.fun1();
		System.out.println();
		
		Gdemo1<String> d2=new Gdemo1<String>();
		d2.x="example";
		System.out.println(d2.x);
		int i=d2.x.length();
		System.out.println("size :"+i);
		System.out.println();
		
		Gdemo1<Integer> d3=new Gdemo1<Integer>();
		d3.x=6;
		d3.x=d3.x+1;
		System.out.println(d3.x);
	}
}
