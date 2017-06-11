package pack1;

public class Gdemo3<S, T> 
{
	S x;
	T y;
	void funG1(S x,T y){
		this.x = x;
		this.y = y;
	}
	S funG2(){
		return x;
	}
	T funG3(){
		return y;
	}
	public static void main(String[] args) {
		Gdemo3<Integer, String> g1 = new Gdemo3<Integer, String>();
		g1.funG1(15, "Age");
		int x1 = g1.funG2();
		System.out.println("x1 :: "+x1);
		String x2 = g1.funG3();
		System.out.println("x2 :: "+x2);
	}
}