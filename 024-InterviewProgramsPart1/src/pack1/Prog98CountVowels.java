package pack1;

import java.util.ArrayList;
import java.util.List;

public class Prog98CountVowels {
	public static void main(String[] args) 
	{
//		Count Number Of vowels in a string
		String str = "Java Concept Of The Day";
		int count = 0;
		
		List list = new ArrayList();
		list.add('A');list.add('E');list.add('I');list.add('O');list.add('U');
		list.add('a');list.add('e');list.add('i');list.add('o');list.add('u');
		
		StringBuilder sb = new StringBuilder();
		char[] charArray = str.toCharArray();
		for(Character ch : charArray){
			if(list.contains(ch))
			{
				count++;
			}
		}	
		System.out.println("Numbers of Vowels in String :"+count);
	}
}