package Prog15PrintOddEvenUsingThread;

public class EvenNumProducer implements Runnable {
	SharedPrinter sp;
	int index;

	public EvenNumProducer(SharedPrinter sp, int index) {
		this.sp = sp;
		this.index = index;
	}

	public void run() {
		for (int i = 2; i <= index; i = i + 2) {
			sp.printEvenNum(i);
		}
	}
}