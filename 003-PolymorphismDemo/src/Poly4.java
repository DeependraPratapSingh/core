public class Poly4 
{
	void fun1(int x, int y)
	{
		System.out.println("from fun1(int x, int y)");
	}
	void fun1(int x,float y)
	{
		System.out.println("from fun1(int x, float y)");
	}
	void fun1(float x, int y)
	{
		System.out.println("from fun1(float x, int y)");
	}
	public static void main(String[] args) {
		Poly4 p1 = new Poly4();
		int i = 4;
		float j = 3.0f;
		p1.fun1(i, i);
		p1.fun1(i, j);
		p1.fun1(j, i);
	}
}