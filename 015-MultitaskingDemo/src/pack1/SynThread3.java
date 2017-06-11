package pack1;

public class SynThread3 extends Thread {
	A a1;

	public SynThread3(A a1) {
		this.a1 = a1;
	}

	@Override
	public void run() {
		a1.funA("pascal");
	}

}
