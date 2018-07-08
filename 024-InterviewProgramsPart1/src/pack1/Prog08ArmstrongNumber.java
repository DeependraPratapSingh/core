// WAP to find the Armstrong number in java
package pack1;

public class Prog08ArmstrongNumber {
	public static void main(String[] args) {
		int no = 371;
		int temp = no;
		int arm = 0;

		while (no > 0) {
			int a = no % 10;
			no = no / 10;
			arm = arm + a * a * a;
		}
		if (arm == temp) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}
}