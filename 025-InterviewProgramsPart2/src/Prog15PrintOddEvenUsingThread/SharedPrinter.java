package Prog15PrintOddEvenUsingThread;

public class SharedPrinter {
	boolean flag = false;

	public void printEvenNum(int num) {
		synchronized (this) {
			while (!flag) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("even :"+num);
			flag = false;
			notify();
		}
	}

	public void printOddNum(int num) {
		synchronized (this) {
			while (flag) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("odd :"+num);
			flag = true;
			notify();
		}
	}
}