// WAP to find the number of digits in the given number.
package pack1;

public class Prog17NumberOfDigits {

	public static void main(String[] args) {
		int no = -32;
		int a = 0;

		if (no < 0) {
			no = no * -1;
		} else {
			if (no == 0) {
				a++;
			}
		}

		while (no > 0) {
			no = no / 10;
			a++;
		}
		System.out.println("No Of Digits In the given Number : " + a);
	}
}