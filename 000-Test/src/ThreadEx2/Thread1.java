package ThreadEx2;

public class Thread1 extends Thread
{
	A a1;
	Thread3 t3;
	public Thread1(A a1, Thread3 t3){
		this.a1 = a1;
		this.t3 = t3;
	}
	public void run(){
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a1.funA("JAVA");
	}
}
