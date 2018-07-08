// WAP to count number of vowels in a String.
package Pack1;

import java.util.ArrayList;

public class Prog04CountVowels {
	public static void main(String[] args) {
		String s = "Welcome to java world";
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

		int count = 0;
		char[] arr = s.toCharArray();
		for (Character ch : arr) {
			if (vowList.contains(ch)) {
				count++;
			}
		}
		int numOfVowels = count;
		System.out.println("numOfVowels in String : " + numOfVowels);
	}
}