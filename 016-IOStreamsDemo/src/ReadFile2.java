import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class ReadFile2 
{
	public static void main(String aa[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try 
		{
			System.out.println("please inter the filename :");
			String fname=br.readLine();
			try 
			{
				FileInputStream fis = new FileInputStream(fname.trim());
				int size=fis.available();
				byte ba[]=new byte[size];
				String data=new String(ba);
				System.out.println(data);
				fis.close();
			} 
			catch (Exception e1) 
			{
				System.out.println(fname+"not found");
			}
		} 
		catch (Exception e2)  
		{
			System.out.println(e2);
		}
	}
}
