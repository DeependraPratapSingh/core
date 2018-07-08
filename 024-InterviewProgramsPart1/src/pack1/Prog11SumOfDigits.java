// WAP to find sum of digits
package pack1;

public class Prog11SumOfDigits {

	public static void main(String[] args) {
		int no = 1375;
		int sum = 0;

		while (no > 0) {
			int a = no % 10;
			no = no / 10;
			sum = sum + a;
		}
		System.out.println("Sum Of Digits :" + sum);
	}
}