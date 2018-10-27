package pack2;
import java.util.*;

public class Prog98RemoveVowels {
	public static void main(String[] args) {
//		Remove Vowels from the String
		String str = "Java Concept Of The Day";
		
		List list = new ArrayList();
		list.add('A');list.add('E');list.add('I');list.add('O');list.add('U');
		list.add('a');list.add('e');list.add('i');list.add('o');list.add('u');
		
		StringBuilder sb = new StringBuilder();
		char[] charArray = str.toCharArray();
		for(Character ch : charArray){
			if(!list.contains(ch))
			{
				sb.append(ch);
			}
		}	
		System.out.println(sb.toString());
	}
}
