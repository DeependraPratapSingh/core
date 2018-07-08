import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriteObject1 
{
	public static void main(String a[])
	{
		try 
		{
			FileOutputStream fos=new FileOutputStream("objFile1.txt",true);
			try 
			{
				ObjectOutputStream oos=new ObjectOutputStream(fos);

				A a1=new A();
				a1.i=13;
				a1.j=203;
				oos.writeObject(a1);
				
				a1.i=9;
				a1.j=12;
				String s1=new String("john");
				oos.writeObject(s1);
				
				Integer i1=109;
				oos.writeObject(i1);
			} 
			catch (IOException e2) 
			{
				System.out.println(e2);
			}
			try 
			{
				fos.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e1) 
		{
			System.out.println(e1);
		}
	}
}
