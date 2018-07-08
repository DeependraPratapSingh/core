// WAP to check prime number
package pack1;

import java.util.Scanner;

public class Prog01CheckPrime {
	public static void main(String[] args) {
		int i;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value For X:");
		int x = s.nextInt();

		if (x == 1) {
			System.out.println("Smallest prime number is 2");
		}
		for (i = 2; i < x; i++) {
			if (x % i == 0) {
				System.out.println("Not Prime");
				break;
			}
		}
		if (x == i) {
			System.out.println(x + " is Prime");
		}
		s.close();
	}
}