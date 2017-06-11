package Pack4;

public class D extends E
{
	int x,y;
	void funD()
	{
		System.out.println("funD() of class D");
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("hashcode :: "+d1.hashCode());
		System.out.println("getclass :: "+d1.getClass());
	}
}
