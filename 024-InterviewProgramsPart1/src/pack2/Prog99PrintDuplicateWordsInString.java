//  Java program to print count of each word in a string and find repeating words

package pack2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Prog99PrintDuplicateWordsInString {
	public static void DuplicateWord(String str) {
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		String[] wordArray = str.split(" ");
		for (String ch : wordArray) {
			if (!hm.containsKey(ch))
				hm.put(ch, 1);
			else
				hm.put(ch, hm.get(ch) + 1);
		}
		Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " --> " + entry.getValue());
			}
		}
	}
	public static void main(String[] args) {
//		Prog99PrintDuplicateChar pdc = new Prog99PrintDuplicateChar();
		String str = "Welcome to to java world world";
		Prog99PrintDuplicateWordsInString.DuplicateWord(str);
	}
}