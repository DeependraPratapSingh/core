package pack1;

public class Gdemo2<T>
{
	T x;
	void funG1(T x){
		this.x = x;
	}
	T funG2(){
		return x;
	}
	
	public static void main(String[] args) {
		Gdemo2<Integer> g1 = new Gdemo2<Integer>();
		g1.funG1(13);
		Integer x1 = g1.funG2();
		System.out.println("x1 :: "+x1);
		
		Gdemo2<String> g2 = new Gdemo2<String>();
		g2.x ="Deepen";
		System.out.println("g2.x : "+g2.x);
		g2.funG1("Deependra");
		System.out.println("g2.x :: "+g2.x);
		String x2 = g2.funG2();
		System.out.println("g2.x ::: "+x2);
		int length = g2.x.length();
		System.out.println("Length Of String :: "+length);
		System.out.println("x2.length :: "+x2.length());
	}
}