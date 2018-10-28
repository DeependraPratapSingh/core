// WAP to print natural number from 1 to n and find the sum of n natural number.
// The positive integer 1,2,3,4,.... etc are known as natural number.
package pack1;

public class Prog21PrintNaturalNoAndSum {
	public static void main(String[] args) {
		int number = 25;
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("The sum of natural numbers from 1 to " + number + " = " + sum);

		System.out.println("Using whle loop");
		int num = 25;
		int i = 1;
		int total = 0;
		while (i <= num) {
			System.out.println(i);
			total = total + i;
			i++;
		}
		System.out.println("The Total of natural numbers from 1 to " + num + " = " + total);
	}
}