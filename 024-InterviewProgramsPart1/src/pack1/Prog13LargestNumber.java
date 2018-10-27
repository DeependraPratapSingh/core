// WAP to find largest number among three numbers
package pack1;

public class Prog13LargestNumber {
	public static void main(String[] args) {
		int a=7,b=6,c=6;
		
		if (a >= b && a >= c) {
			System.out.println("Largest Number is :"+a);
		}
		if (b >= a && b>= c) {
			System.out.println("Largest Number is :"+b);
		}
		if (c >= a && c >= b) {
			System.out.println("Largest Number is :"+c);
		}
	}

}
