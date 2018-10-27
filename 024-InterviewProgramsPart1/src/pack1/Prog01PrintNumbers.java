// WAP to print numbers from 1 to 10, without using loop.
package pack1;

public class Prog01PrintNumbers {
//	Approach 1
	/*static int n =0;
	public static void main(String[] args) {
		printNumbers();
	}
	public static void printNumbers() {
		if (n <= 10) {
			System.out.println(n);
			n++;
			printNumbers();
		}
	}*/
	
	
	
//	Approach 2
	/*public static void main(String[] args) {
		printNumbers(0);
	}
	public static void printNumbers(int n) {
		if (n <= 10) {
			System.out.println(n);
			printNumbers(++n);
//			printNumbers(n+1);
		}
	}*/	
	
	
//	Approach 3
	public static void main(String[] args) {
		printNumbers(10);
	}
	public static void printNumbers(int n) {
		if (n > 0) {
			printNumbers(n-1);
			System.out.println(n);
		}		
	}
}