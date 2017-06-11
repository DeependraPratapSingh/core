import java.util.HashSet;
import java.util.Set;

/**
 * Jun 6, 2016,11:48:57 PM,
 */

/**
 * @author DnZdP
 *
 */
public class Test2 {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		String s2 = new String("hello");
		String s3 = new String("hello");
		String s4 = new String("Hello");
		s1.add(s2);
		s1.add(s3);
		s1.add(s4);
		System.out.println(s1);
	}
}
