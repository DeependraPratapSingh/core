// WAP to reverse vowels in a String.
package Pack1;

import java.util.ArrayList;

public class Prog02ReverseVowels {
	public static void main(String[] args) {
		Prog02ReverseVowels p2 = new Prog02ReverseVowels();
		String s = p2.reverseVowels("Education");
		System.out.println(s);
	}

	public String reverseVowels(String s) {
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

		char[] arr = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (!vowList.contains(arr[i])) {
				i++;
				continue;
			}
			if (!vowList.contains(arr[j])) {
				j--;
				continue;
			}
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}
		return new String(arr);
	}
}