public class Gdemo1<T> 
{
	T x;
	public static void main(String[] args) {
		Gdemo1<A> g1 = new Gdemo1<A>();
		g1.x = new A();
		System.out.println(g1.x.i);
		g1.x.funA();
		
		Gdemo1<String> g2 = new Gdemo1<String>();
		g2.x = "Example";
		System.out.println(g2.x);
		int len = g2.x.length();
		System.out.println("length :"+len);
		
//		Gdemo1<int> g3 = new Gdemo1<int>();
//		premitive datavalues are not allowed.
		Gdemo1<Integer> g3 = new Gdemo1<Integer>();
		g3.x= 13;
		System.out.println(g3.x);
	}
}
