package MapCollection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("d01", "Deependra");
		System.out.println(m1.get("d01"));
		String h1 = m1.put("d01", "Deependra001");
		System.out.println(h1);
 	}
}