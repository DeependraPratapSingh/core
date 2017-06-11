

public class ThreadA implements Runnable
{
		public void run() 
		{
			System.out.println("begining of t1");
			for(int i=0;i<=50;i++)
			{
				System.out.println("t1 :"+i);
			}
			System.out.println("end of t1");
		}
}
