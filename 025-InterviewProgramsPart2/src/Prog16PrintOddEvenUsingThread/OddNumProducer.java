package Prog16PrintOddEvenUsingThread;

public class OddNumProducer implements Runnable {
	SharedPrinter sp;
	int index;

	public OddNumProducer(SharedPrinter sp, int index) {
		this.sp = sp;
		this.index = index;
	}

	public void run() {
		for (int i = 1; i <= index; i = i + 2) {
			sp.printOddNum(i);
		}
	}
}