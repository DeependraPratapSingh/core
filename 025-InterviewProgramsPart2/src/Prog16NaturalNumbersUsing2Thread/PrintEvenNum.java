package Prog16NaturalNumbersUsing2Thread;

public class PrintEvenNum implements Runnable {
	static boolean flag = false;
	Object obj = null;

	public PrintEvenNum(Object obj) {
		this.obj = obj;
	}

	public void run() {
		for (int i = 2; i <= 100; i=i+2) {
			synchronized (obj) {
				while ( !flag ) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even Thread-2 :"+i);
				flag = false;
				obj.notify();
			}
		}
	}
}