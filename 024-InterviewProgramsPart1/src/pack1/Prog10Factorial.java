// WAP to find factorial of the given numbers
package pack1;

public class Prog10Factorial {
	public static void main(String[] args) {
		int x =5;
		int fact = 1;
		
		for (int i = 1; i <= x; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is :" +fact);
	}
}