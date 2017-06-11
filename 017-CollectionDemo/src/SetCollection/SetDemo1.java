/**
 * Apr 11, 2016,6:32:36 PM,SetCollection
 */
package SetCollection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author DnZdP
 *
 */
public class SetDemo1 {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(5);
		h1.add(13);
		h1.add(1);
		h1.add(9);
		h1.add(21);
		System.out.println(h1);
		
		Iterator<Integer> i1 = h1.iterator();
		while (i1.hasNext()) {
			int x = i1.next();
			System.out.println(x);
		}
	}
}