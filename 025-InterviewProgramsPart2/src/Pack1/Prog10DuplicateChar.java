package Pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prog10DuplicateChar {
	public static void printDuplicateChar(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray();
		for (Character ch : arr) {
			if (!hm.containsKey(ch)) {
				hm.put(ch, 1);
			} else {
				hm.put(ch, hm.get(ch) + 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = hm.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Key :" + entry.getKey() + " Value :" + entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		printDuplicateChar("deependra");
	}
}