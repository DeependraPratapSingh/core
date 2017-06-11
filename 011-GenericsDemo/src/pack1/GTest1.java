package pack1;

public class GTest1 {
	public static void main(String[] args) {
		Gdemo2 g1 = new Gdemo2();
		System.out.println("g1.x :: "+g1.x);
		
		g1.funG1("Deepu");
		String x1 = (String)g1.funG2();
		System.out.println("x1 :: "+x1);
		
		g1.funG1(15);
		int x2 = (int)g1.funG2();
		System.out.println("x2 :: "+x2);
	}
}
