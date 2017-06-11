public class Ademo 
{
	public static void fun1(String s1[])
	{
		System.out.println(s1);
		if(s1 != null && s1.length>0)
		{
			System.out.println(s1[s1.length-1]);
			System.out.println("size :: "+s1.length);
		}
		System.out.println("end of fun1");
	}
	
	public static void main(String[] s2) 
	{
		System.out.println("begining of main Ademo");
		System.out.println(s2);
//		System.out.println(s2.length);
		if (s2 != null) {
			System.out.println(s2.length);
		}
		System.out.println("end of main Ademo");
	}
}