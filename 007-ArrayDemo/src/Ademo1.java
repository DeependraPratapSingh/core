public class Ademo1 {
	
	void fun1(int x[])
	{
		System.out.println(x);
//		System.out.println(x[x.length-1]);
		if(x != null && x.length>0)
		{
			System.out.println(x[x.length-1]);
			System.out.println("size"+x.length);
		}
		System.out.println("end of fun1");
	}
	public static void main(String[] args) {
		Ademo1 d1 = new Ademo1();
		int i[] = {2,3,5,7};
		d1.fun1(i);
		d1.fun1(new int[3]);
		d1.fun1(null);
		d1.fun1(new int[0]);
	}
}