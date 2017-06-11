package threadEx1;

public class DeamonThread1 extends Thread {
	public void run() 
	{
		System.out.println("Starting of DeamonThread1");
		long l = 0;
		while (true) {
			l = l + 1;
			System.out.println("l :" + l);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		// System.out.println("Ending of DeamonThread2"); //Unrechable statement
	}
	public static void main(String[] args) {
		System.out.println("Startig of main Thread");
		DeamonThread1 d1 = new DeamonThread1();
		d1.setDaemon(true);//Explicitly mentioning d1 as a deamon thread.
		d1.start();
		System.out.println("Ending of Deamon Thread .......  Printing from main thread...");
		for (int i = 0; i < 50; i++) {
			System.out.println("main() :"+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Ending of main Thread");
	}
}