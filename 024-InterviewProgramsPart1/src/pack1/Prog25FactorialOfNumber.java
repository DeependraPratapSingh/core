// WAP to find factorial of a number
// The number that is completly divisible by the given number(it means the reminder should be zero) are called as factor of the given number.
package pack1;

public class Prog25FactorialOfNumber {
	public static void main(String[] args) {
		int number = 175;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println("Factor :: " + i);
			}
		}
	}
}