// WAP to check palindrome Number in Java
package pack1;

public class Prog16PalindromeNumber {
	public static void main(String[] args) {
		int no = 122;
		int b = no;
		int temp = 0;
		
		while (no > 0) {
			int a = no % 10;
			no = no / 10;
			temp = temp*10 + a;
		}
		if(temp == b){
			System.out.println("Is Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}