public class Gdemo3<K,V> 
{
	K i;
	V j;
	
	void fun1(K i,V j)
	{
		this.i=i;
		this.j=j;
	}
	K getK()
	{
		return(i);
	}
	V getV()
	{
		return(j);
	}
	
	public static void main(String a[])
	{
		Gdemo3<String,Integer> d1=new Gdemo3<String,Integer>();
		d1.fun1("durga",100);
		String s1=d1.getK();
		System.out.println(s1);
		
		int x=d1.getV();
		System.out.println(x);
	}
}
