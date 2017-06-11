package pack1;

public class SynTest extends Thread
{
	public static void main(String[] args) {
		A a1 = new A();
		
		SynThread1 t1 = new SynThread1(a1);
		SyncThread2 t2 = new SyncThread2(a1);
		SynThread3 t3 = new SynThread3(a1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}