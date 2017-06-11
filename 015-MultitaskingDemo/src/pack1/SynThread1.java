package pack1;

public class SynThread1 extends Thread {
	A a1;

	public SynThread1(A a1) {
		this.a1 = a1;
	}

	public void run() {
		a1.funA("java");
	}
}
