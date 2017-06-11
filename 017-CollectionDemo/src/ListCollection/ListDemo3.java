/**
 * Apr 11, 2016,7:14:58 PM,ListCollection
 */
package ListCollection;

import java.util.ArrayList;

/**
 * @author DnZdP
 *
 */
public class ListDemo3 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(12);
		al.add(9);
		for (Integer x : al) {
			System.out.println("elements from ArrayList : "+x);
		}
		System.out.println();
		for (int i = 0; i < al.size(); i++) {
			int element = al.get(i);
			System.out.println("elemet from ArrayList :: "+element);
		}
	}
}