package pack1;

public class A 
{
	//	public void funA(String s1)
	synchronized public void funA(String s1)
	{
		System.out.print("[Hello["+s1);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("]World]");
	}
}