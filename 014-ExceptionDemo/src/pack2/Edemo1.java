package pack2;

public class Edemo1 
{
	void funE1(int x,int y)
	{
		int z=0;
		System.out.println("from funE() of class Edemo1");
		try {
			z=x/y;			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("x/y :: "+x+"/"+y+" = "+z);
	}
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0].trim());
		int y = Integer.parseInt(args[1].trim());
		Edemo1 e1 = new Edemo1();
		e1.funE1(x, y);
	}
}