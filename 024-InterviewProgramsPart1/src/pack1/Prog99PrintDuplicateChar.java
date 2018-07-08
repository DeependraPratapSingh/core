package pack1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Prog99PrintDuplicateChar {
	public void DuplicateChar(String str) {
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		char[] charArray = str.toLowerCase().toCharArray();
		for (char ch : charArray) {
			if (!hm.containsKey(ch))
				hm.put(ch, 1);
			else
				hm.put(ch, hm.get(ch) + 1);
		}
		Set<Map.Entry<Character, Integer>> entrySet = hm.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getKey() > 1) {
				System.out.println(entry.getKey() + " --> " + entry.getValue());
			}
		}
	}
	public static void main(String[] args) {
		Prog99PrintDuplicateChar pdc = new Prog99PrintDuplicateChar();
		String str = "Deependra";
		pdc.DuplicateChar(str);
	}
}