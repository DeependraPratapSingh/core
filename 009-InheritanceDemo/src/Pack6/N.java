package Pack6;

public class N extends L
{
	int i,k;
	void funN()
	{
		System.out.println("from funN() of class N");
	}
	void fun1()
	{
		System.out.println("from fun1() of class N");
	}
	public static void main(String[] args) {
		M m1 = new N();
		m1.funM();
		m1.funN();
	}
}
