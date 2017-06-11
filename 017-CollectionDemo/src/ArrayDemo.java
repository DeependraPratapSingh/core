/*Getting the Largest Value in an ArrayList
Write a program that creates an ArrayList which can hold Integers. 
Enter the number of integers that will be inserted, then enter those integers. 
Then use a linear search to find the largest value in the ArrayList, and display that value.

For example:
Input:
3
1
2
3
Output:
3*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayDemo 
{
	public static void main(String a[])
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(3);
		al.add(7);
		al.add(13);
		System.out.println(al);
		for (int x : al){
			System.out.println(x);
		}
		System.out.println();
		for (int i = 0; i < al.size(); i++) {
			int y = al.get(i);
			System.out.println(y);
		}
		
		
		int index=0;
		Integer max=al.get(0);
		for (int i = 0; i < al.size(); i++){
			Integer item=al.get(i);
			if (max.compareTo(item)<0){
				index=i;
				max=item;
			}
		}
		System.out.println("max item :"+al.get(index)+"at index :"+index);	
/*		Integer m=Collections.max(al);
		System.out.println("max = "+m);
*/
	}
}