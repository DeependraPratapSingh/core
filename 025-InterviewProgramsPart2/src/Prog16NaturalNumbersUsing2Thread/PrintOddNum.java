package Prog16NaturalNumbersUsing2Thread;

public class PrintOddNum implements Runnable {
	Object obj;

	public PrintOddNum(Object obj) {
		this.obj = obj;
	}

	public void run() {
		for (int i = 1; i <= 100; i = i + 2) {
			synchronized (obj) {
				while (PrintEvenNum.flag) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Odd Thread-1 :" + i);
				PrintEvenNum.flag = true;
				obj.notify();
			}
		}
	}
}