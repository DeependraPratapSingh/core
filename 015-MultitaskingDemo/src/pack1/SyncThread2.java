package pack1;

public class SyncThread2 extends Thread {
	A a1;

	public SyncThread2(A a1) {
		this.a1 = a1;
	}

	@Override
	public void run() {
		a1.funA("VB.Net");
	}

}
