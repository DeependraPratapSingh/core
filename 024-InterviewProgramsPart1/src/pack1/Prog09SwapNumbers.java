// WAP to swap two numbers without using third variable
package pack1;

public class Prog09SwapNumbers {
	public static void main(String[] args) {
		int a=5,b=9;
		System.out.println("Before Swapping ...");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping ...");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
