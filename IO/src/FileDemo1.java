import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;


public class FileDemo1 
{
	public static void main(String a[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try 
		{
			System.out.println("please enter the date to be saved into the file :");
			String data=br.readLine();
			FileOutputStream fos=new FileOutputStream("file1.txt",true);
//			FileOutputStream fos=new FileOutputStream("file1.txt");
			byte ba[]=data.getBytes();
			fos.write(ba);
			fos.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}