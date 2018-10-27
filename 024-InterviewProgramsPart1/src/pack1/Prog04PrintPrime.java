// WAP to print prime numbers from 1 to 100.
package pack1;

public class Prog04PrintPrime {
	
	public static void main(String[] args) {
		int totals = 0;
		for (int i = 1; i <= 100; i++) {
			int counter = 0;
			if (i == 1) {
				counter++;
			}
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					counter++;
					break;
				}
			}
			if (counter == 0) {
				System.out.println(i + "");
				totals++;
			}
		}
		System.out.println("Total PrimeNumner: "+totals);
	}
} 