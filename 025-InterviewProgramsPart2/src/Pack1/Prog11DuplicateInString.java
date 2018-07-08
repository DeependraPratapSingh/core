// WAP to find duplicate words in String
// WAP to print count of each word in a String and find the repeating word.
package Pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prog11DuplicateInString {
	public static void findDuplicateWords(String s) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String[] arr = s.split(" ");
		for (String str : arr) {
			if (!hm.containsKey(str))
				hm.put(str, 1);
			else
				hm.put(str, hm.get(str) + 1);
		}

		Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Key :" + entry.getKey() + ", Value :" + entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		String str = "Welcome to to java java java world";
		findDuplicateWords(str);
	}
}
