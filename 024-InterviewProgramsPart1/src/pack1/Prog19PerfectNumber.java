// WAP to find that number is perfect or not
package pack1;

public class Prog19PerfectNumber {
	public boolean IsPerfectNumber(int number) {
		int temp = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				temp = temp + i;
			}
		}
		if (temp == number) {
			System.out.println("It is a perfect number");
			return true;
		} else {
			System.out.println("it is not a perfect Number");
			return false;
		}
	}

	public static void main(String[] args) {
		Prog19PerfectNumber p1 = new Prog19PerfectNumber();
		p1.IsPerfectNumber(28);
	}
}