package ThreadEx3;

public class SleepDemo1 extends Thread
{
	public void run(){
		System.out.println("Start of run()");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 50; i++) {
			System.out.println("run() :"+i);
		}
		System.out.println("End of run()");
	}
	public static void main(String[] args) {
		System.out.println("Start of main thread");
		SleepDemo1 s1 = new SleepDemo1();
//		s1.setDaemon(true);
		s1.start();
		for (int i = 0; i < 50; i++) {
			System.out.println("main() :"+i);
		}
		System.out.println("End of main Thread");
	}

}