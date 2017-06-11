package ThreadEx2;

public class A {
//	public void funA(String Subject) {
	synchronized public void funA(String Subject) {
		System.out.print("[Hello[" + Subject);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]World]");
	}
}
