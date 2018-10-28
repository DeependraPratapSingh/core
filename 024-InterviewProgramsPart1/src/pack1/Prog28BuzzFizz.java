// Write Buzz Fizz program in java
// Print numbers from  1 to 100, 
// But multiplication of 3 should be replaced with Fizz,
// multiplication of 5 should be replaced with Buzz and 
// multiplication of 3 and 5 should be replaced with FizzBuzz.
package pack1;

public class Prog28BuzzFizz {
	public static void main(String[] args) {
		int no = 20;
		for (int i = 1; i <= no; i++) {
			if ((i % (3 * 5)) == 0) {
				System.out.println("FizzBuzz");
			} else {
				if ((i % 5) == 0) {
					System.out.println("Buzz");
				} else {
					if ((i % 3) == 0) {
						System.out.println("Fizz");
					} else {
						System.out.println(i);
					}
				}
			}
		}
	}
}