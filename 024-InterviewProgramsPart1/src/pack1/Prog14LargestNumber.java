// WAP to find largest number among three numbers
package pack1;

public class Prog14LargestNumber {

	public static void main(String[] args) {
		int a=9, b=10, c=9;
		
		int largest = (a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Largest Number is : "+largest);
	}
}