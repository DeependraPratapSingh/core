// WAP to iterate HashMap using entrySet.
package Pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prog08IterateHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Apple");
		hm.put(2, "Ball");
		hm.put(3, "Cat");

		Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();
		for (Map.Entry<Integer, String> entry : entrySet) {
			System.out.println("Key :" + entry.getKey());
			System.out.println("Value :" + entry.getValue());
		}
	}
}