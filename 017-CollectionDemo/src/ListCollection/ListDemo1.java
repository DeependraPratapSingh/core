/**
 * Apr 11, 2016,7:01:32 PM,ListCollection
 */
package ListCollection;

import java.util.Vector;

/**
 * @author DnZdP
 *
 */
public class ListDemo1 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(8);
		v1.add(23);
		v1.add(19);
		for (Integer x : v1) {
			System.out.println(x);
		}
		int size = v1.size();
		System.out.println("Size : "+size);
		int capacity = v1.capacity();
		System.out.println("Capicity : "+capacity);
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.elementAt(i));
		}
		
		System.out.println();
		Vector<String> v2 = new Vector<String>();
		v2.add("dp01");
		v2.add("dp02");
		v2.add("dp03");
		String LastElement = v2.elementAt(v2.size()-1);
		System.out.println("LastElement :: "+LastElement);
	}
}
