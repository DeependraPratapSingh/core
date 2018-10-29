package Prog14DeadLock;

public class B {
	public synchronized void d2(A a) {
		System.out.println("Thread-2 start execution d2()");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Thread-2 trying to call a's last() method");
		a.last();
	}

	public synchronized void last() {
		System.out.println("In class B this is last() method");
	}
}