// WAP to reverse a string using recursion
package Pack1;

public class Prog05ReverseString {
	String reverse = "";

	public String reverseString(String s) {
		if (s.length() == 1) {
			return s;
		} else {
			reverse = reverse + s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
			return reverse;
		}
	}

	public static void main(String[] args) {
		Prog05ReverseString p5 = new Prog05ReverseString();
		String s = p5.reverseString("skillgun");
		System.out.print(s);
	}
}