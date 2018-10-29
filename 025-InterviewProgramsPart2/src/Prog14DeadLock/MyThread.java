// WAP to create deadlock between two threads.
package Prog14DeadLock;

public class MyThread extends Thread
{
	A a = new A();
	B b = new B();
	public void run() {
		b.d2(a);	//executed by child thread
	}
	
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		mt.a.d1(mt.b);	//executed by main thread
	}
}