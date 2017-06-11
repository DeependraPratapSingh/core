import java.util.HashSet;
import java.util.Set;

/**
 * Jun 6, 2016,11:57:52 PM,
 */

/**
 * @author DnZdP
 *
 */
public class Test3 {
	int i = 99;
	public String toString(){
		return ""+i;
	}
	public int hashCode() {
		System.out.println("hashcode()");
		return i;
	}
	public boolean equals(Object obj) {
		System.out.println("equals()");
		return false;
	}
	public static void main(String[] args) {
		Set s = new HashSet();
		Test3 t1 = new Test3();
		Test3 t2 = new Test3();
		s.add(t1);
		s.add(t2);
		System.out.println(s);
	}  
}
