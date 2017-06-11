/**
 * May 5, 2015,9:39:09 AM,
 */

/**
 * @author DnzDP
 *
 */
public class Gtest1
{
	public static void main(String[] args) {
		Gdemo2 g1 = new Gdemo2();
		System.out.println(g1.t1);
		g1.fun1("AABBCC");
		String a = (String)g1.fun2();
		System.out.println("a :"+a);
		
		g1.fun1(new A());
		A a1 = (A)g1.fun2();
		System.out.println("a1.i :"+a1.i);
		a1.funA();
	}
}