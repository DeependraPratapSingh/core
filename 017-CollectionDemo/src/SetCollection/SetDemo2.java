/**
 * Apr 11, 2016,6:36:59 PM,SetCollection
 */
package SetCollection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author DnZdP
 *
 */
public class SetDemo2 {
	public static void main(String[] args) {
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(9);
		t1.add(5);
		t1.add(13);
		t1.add(1);
		t1.add(3);
		System.out.println(t1);
		
		System.out.println();
		System.out.println("first and last element from TreeSet");
		int x = t1.first();
		System.out.println("x ::"+x);
		int y = t1.last();
		System.out.println("y ::"+y);
		
		System.out.println();
		System.out.println("Iterate throw Iterator");
		Iterator<Integer> i1 = t1.iterator();
		while (i1.hasNext()){
			int i = i1.next();
			System.out.println(i);
		}
	}
}