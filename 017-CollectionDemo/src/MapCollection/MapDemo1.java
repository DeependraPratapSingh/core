/**
 * Apr 11, 2016,7:20:17 PM,MapCollection
 */
package MapCollection;

import java.util.Enumeration;
import java.util.Hashtable;

public class MapDemo1 {
	public static void main(String[] args) {
		Hashtable<String, Integer> h1 = new Hashtable<String, Integer>();
		h1.put("dp01", 001);
		h1.put("dp02", 002);
		h1.put("dp03", 003);
		h1.put("dp04", 004);
		
		System.out.println();
		System.out.println("Getting One Element");
		Integer i1 = h1.get("dp02");
		System.out.println(i1);
		
		System.out.println();
		System.out.println("Iterate All elements");
		Enumeration<String> e1 = h1.keys();
		while (e1.hasMoreElements()) {
			String key = e1.nextElement();
			int value = h1.get(key);
			System.out.println("Key :"+key+" Value :"+value);
		}
	}
}