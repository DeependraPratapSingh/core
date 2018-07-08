// WAP to find the sum of first 1000 prime numbers
package pack1;

public class Prog03PrimeSum {

	public static void main(String[] args) {
		int number = 2;
		int count = 0;
		int sum = 0;
		
		while (count < 1000) {
			if(isPrimeNumber(number)){
				sum = sum + number;
				count++;
				System.out.println(number);
			}
			number++;
		}
		System.out.println("Sum of first 1000 prime numbers: " + sum);
	}
	
	private static boolean isPrimeNumber(int number) {
		boolean flag = false;
		if(number == 2){
			flag = true;
		}
		else if (number > 2) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					flag = false;
					break;
				}
				flag = true;
			}
		}
		return flag;
	}
}