package Pack5;

public class D extends E
{
	int a,b;
	void funD()
	{
		System.out.println("funD() of class D");
	}
	public D()
	{
		super(3);
		System.out.println("from Constructor D() of class D");
	}
	public static void main(String[] args) {
		D d1 = new D();
		System.out.println("hascode :: "+d1.hashCode());
		System.out.println("getclass :: "+d1.getClass());
	}
}