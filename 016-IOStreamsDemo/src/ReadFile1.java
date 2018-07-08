import java.io.FileInputStream;


public class ReadFile1 
{
	public static void main(String a[])
	{
		try
		{
			FileInputStream fis=new FileInputStream("file1.txt");
			int size=fis.available();
			byte ba[]=new byte[size];
			fis.read(ba);
			String data=new String(ba);
			System.out.println(data);
			fis.close();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}