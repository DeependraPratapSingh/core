public class ThreadTest2 
{
	public static void main(String a[])
	{
		ThreadA ta=new ThreadA();
		ThreadB tb=new ThreadB();
		
		Thread t1=new Thread(ta);
		Thread t2=new Thread(tb);
		
		t1.start();
		t2.start();
		
		for (int i = 200; i <=250; i++) 
		{
			System.out.println("main() : "+i);
		}
		System.out.println("end of main()");
	}
}



