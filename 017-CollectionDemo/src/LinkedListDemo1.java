import java.util.LinkedList;


public class LinkedListDemo1 
{
	public static void main(String a[])
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(2);
		l1.add(3);
		l1.add(5);
		l1.add(6);
		l1.add(12);
		l1.add(14);
		for (Integer x : l1) {
			System.out.println(x);
		}
		for(int i=0;i<l1.size();i++){
			int y = l1.get(i);
			System.out.println(y);
		}
	}
}