/**
 * Apr 11, 2016,7:55:11 PM,MapCollection
 */
package MapCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author DnZdP
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(100, "dp01");
		h1.put(200, "dp02");
		h1.put(300, "dp03");
		String element = h1.get(200);
		System.out.println(200 + " " +element);
		
		Set<Integer> s1 = h1.keySet();
		Iterator<Integer> i1 = s1.iterator();
		while (i1.hasNext()){
			int key = i1.next();
			String value = h1.get(key);
			System.out.println(key+" "+value);
		}
	}
}