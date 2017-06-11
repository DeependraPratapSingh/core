/**
 * May 5, 2015,9:31:25 AM,
 */

/**
 * @author DnzDP
 *
 */
public class Gdemo3<K,V>
{
	K i;
	V j;
	void fun1(K i,V j){
		this.i=i;
		this.j=j;
	}
	K getk(){
		return i;
	}
	V getv(){
		return j;
	}
	public static void main(String[] args) {
		Gdemo3<String, Integer> g1 = new Gdemo3<String, Integer>();
		g1.fun1("John", 100);
		String s1 =  g1.getk();
		System.out.println("K :"+s1);
		
		int x = g1.getv();
		System.out.println("V :"+x);
	}
}