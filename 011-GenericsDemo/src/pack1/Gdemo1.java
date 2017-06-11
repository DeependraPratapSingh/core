package pack1;

public class Gdemo1<T>
{
	T x;
	public static void main(String[] args) {
		Gdemo1<A> g1 = new Gdemo1<A>();
		System.out.println(g1.x);
		g1.x = new A();
		System.out.println(g1.x);
		System.out.println("x from Class A :: "+g1.x.x);
		g1.x.funA();
		
		Gdemo1<Integer> g2 = new Gdemo1<Integer>();
		System.out.println("x of Class Gdemo1 :: "+g2.x);
		g2.x = 20;
		System.out.println("After Assigning value to x of Class Gdemo1 :: "+g2.x);
		
		Gdemo1<String> g3 = new Gdemo1<String>();
		System.out.println("ge.x :: "+g3.x);
		g3.x="deependra";
		System.out.println("g3.x :: "+g3.x);
	}
}