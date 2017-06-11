package ThreadEx2;

public class Thread2 extends Thread
{
	A a1;
	public Thread2(A a1){
		this.a1 = a1;
	}
	public void run(){
		a1.funA("DOT-NET");
	}
}
