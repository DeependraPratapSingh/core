// WAP to sort a map by values.
package Pack1;

import java.util.Map.Entry;
import java.util.*;

public class Prog09SortMapByValue {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Java", 1);
		hm.put("C++", 5);
		hm.put("Unix", 3);
		hm.put(".Net", 2);

		Set<Map.Entry<String, Integer>> set = hm.entrySet();
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		for (Entry<String, Integer> entry : list) {
			System.out.println("Key :" + entry.getKey() + " Value :" + entry.getValue());
		}
	}
}