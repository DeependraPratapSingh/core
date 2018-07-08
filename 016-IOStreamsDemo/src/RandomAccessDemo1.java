import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;


public class RandomAccessDemo1 
{
	int idno;
	String name;
	float sal;
	RandomAccessFile raf;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	public RandomAccessDemo1() 
	{
		try 
		{
			raf=new RandomAccessFile("emp.dat","rw");
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	public void readEmp()
	{
		try 
		{
			System.out.println("Enter the ID No of the employee :");
			idno=Integer.parseInt(br.readLine().trim());
			
			System.out.println("Enter the name of the employee :");
			name=br.readLine();
			
			System.out.println("Enter the salary of the employee :");
			sal=Float.parseFloat(br.readLine().trim());
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	public void writeFile()
	{
		String ch="yes";
		try 
		{
			raf.seek(raf.length());
			while (ch.equals("yes"))
			{
				readEmp();
				raf.writeInt(idno);
				raf.writeUTF(name);
				raf.writeFloat(sal);
				
				System.out.println("any more record to enter ?");
				ch=br.readLine().trim();
			}
			readFile();
			raf.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	public void readFile()
	{
		try 
		{
			raf.seek(0);
			long size=raf.length();
			
			while (raf.getFilePointer()<size) 
			{
				int id = raf.readInt();
				String name = raf.readUTF();
				float sal = raf.readFloat();
				System.out.println(id + " " + name + " " + sal);
			}
			
		} 
		catch (IOException e) 
		{
			System.out.println(e);
		}
	}
	
	public static void main(String a[]) 
	{
		RandomAccessDemo1 d1=new RandomAccessDemo1();
		d1.writeFile();
	}
}