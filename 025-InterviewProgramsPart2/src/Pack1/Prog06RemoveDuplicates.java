// WAP to remove duplicates from string.
package Pack1;

import java.util.HashSet;
import java.util.Set;

public class Prog06RemoveDuplicates {
	public String removeDuplicated(String str) {
		Set<Character> set = new HashSet<Character>();
		StringBuffer sb = new StringBuffer();
		char[] arr = str.toCharArray();

		for (Character ch : arr) {
			if (!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Prog06RemoveDuplicates p6 = new Prog06RemoveDuplicates();
		String str = p6.removeDuplicated("deependra");
		System.out.println(str);
	}
}