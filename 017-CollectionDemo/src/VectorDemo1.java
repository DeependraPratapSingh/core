import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 
{
	public static void main(String a[])
	{
		Vector<String> v1=new Vector<String>();
		v1.add("john");
		v1.add("ram");
		v1.add("smith");
		v1.add("krish");
		v1.add("satyam");
		System.out.println(v1);
		for (String s1 : v1){
			System.out.println(s1);
		}
		System.out.println("size :"+v1.size());
		System.out.println("capasity :"+v1.capacity());
		for (int i = 0; i < v1.size(); i++){
			System.out.println("At - "+i+" - "+v1.elementAt(i));
		}
		System.out.println();
		
		Vector<Integer> v2=new Vector<Integer>();
		v2.add(1);
		v2.add(2);
		v2.add(3);
		v2.add(4);
		v2.add(5);
		v2.add(6);
		v2.add(7);
		for (Integer s2 : v2) {
			System.out.println(s2);
		}
		int x=v2.elementAt(v2.size()-1);
		System.out.println("x :"+x);		
	}
}