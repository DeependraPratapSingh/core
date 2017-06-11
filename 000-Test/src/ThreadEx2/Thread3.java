package ThreadEx2;

public class Thread3 extends Thread
{
	A a1;
	public Thread3(A a1){
		this.a1 = a1;
	}
	public void run(){
		a1.funA("PHP");
	}
}
