package ThreadEx2;

public class Test {
	public static void main(String[] args) {
		A a1 = new A();
		
		Thread2 t2 = new Thread2(a1);
		Thread3 t3 = new Thread3(a1);
		Thread1 t1 = new Thread1(a1,t3);
		t1.start();
		t2.start();
		t3.start();
	}
}