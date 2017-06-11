

public class ThreadB implements Runnable
{
	public void run() 
	{
		System.out.println("begining of t2");
		for (int i = 100; i <=150; i++) 
		{
			System.out.println("t2 : "+i);
		}
		System.out.println("end of t2");
	}
}
