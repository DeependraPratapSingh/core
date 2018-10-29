// WAP to count number of vowels in a String.
package Pack1;

import java.util.ArrayList;
import java.util.List;

public class Prog04CountVowels {
	public static void main(String[] args) {
		String str = "Java Concept Of The Day";
		int count = 0;
		
		List<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('e');
		list.add('i');
		list.add('o');
		list.add('u');
		list.add('A');
		list.add('E');
		list.add('I');
		list.add('O');
		list.add('U');

		char[] charArray = str.toCharArray();
		for (Character ch : charArray) {
			if (list.contains(ch)) {
				count++;
			}
		}
		System.out.println("numOfVowels in String : " + count);
	}
}