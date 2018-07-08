package Prog14PrintNumAndCharUsingThread;

public class Display {
	public synchronized void displayN() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void displayC() {
		for (int i = 65; i <= 75; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}