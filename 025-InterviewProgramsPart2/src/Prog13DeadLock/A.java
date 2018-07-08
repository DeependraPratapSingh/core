package Prog13DeadLock;

public class A {
	public synchronized void d1(B b) {
		System.out.println("Thread-1 starts execution d1()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Thread-1 trying to call b's last() method");
		b.last();
	}

	public synchronized void last() {
		System.out.println("In Class A this is last() method");
	}
}