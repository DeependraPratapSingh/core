import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
//		HashMap m=new HashMap();
		LinkedHashMap m=new LinkedHashMap();
		m.put("chiranjeevi",700);
		m.put("balash",800);
		m.put("vanketsh", 200);
		m.put("nagarjun",500);
		System.out.println(m);
		
		m.put("chiranjeevi",1000);
		
//		System.out.println(m.put("chiranjeevi",1000));
		System.out.println(m);
		
		Set s=m.keySet();
		System.out.println(s);
		
		Collection c=m.values();
		System.out.println(c);
		
		Set s1=m.entrySet();
		System.out.println(s1);
	}
}
