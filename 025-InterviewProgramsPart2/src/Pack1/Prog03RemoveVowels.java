// WAP to remove vowels from a string.
package Pack1;

import java.util.ArrayList;

public class Prog03RemoveVowels {
	public static void main(String[] args) {
		String s1 = "Welcome to java world";
		ArrayList<Character> vowList = new ArrayList<Character>();
		vowList.add('a');
		vowList.add('e');
		vowList.add('i');
		vowList.add('o');
		vowList.add('u');
		vowList.add('A');
		vowList.add('E');
		vowList.add('I');
		vowList.add('O');
		vowList.add('U');

		char[] arr = s1.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (Character ch : arr) {
			if (!vowList.contains(ch)) {
				sb.append(ch);
			}
		}
		String s = sb.toString();
		System.out.println("Orginal String :" + s1);
		System.out.println("After Vowel Removed :" + s);

	}
}
