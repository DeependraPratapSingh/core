/**
 * Apr 11, 2016,7:11:03 PM,ListCollection
 */
package ListCollection;

import java.util.LinkedList;

/**
 * @author DnZdP
 *
 */
public class ListDemo2 {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(10);
		l1.add(14);
		l1.add(3);
		l1.add(34);
		for (Integer x : l1) {
			System.out.println("Elements in LinkedList : "+x);
		}
	}
}
