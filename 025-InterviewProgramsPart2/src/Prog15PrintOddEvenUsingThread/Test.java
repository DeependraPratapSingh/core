// WAP to print Odd and Even Numbers using two threads.
package Prog15PrintOddEvenUsingThread;

public class Test {
	public static void main(String[] args) {
		SharedPrinter sp = new SharedPrinter();

		EvenNumProducer enp = new EvenNumProducer(sp, 10);
		OddNumProducer onp = new OddNumProducer(sp, 10);

		Thread t1 = new Thread(enp);
		Thread t2 = new Thread(onp);
		t1.start();
		t2.start();
	}
}