/**
 * Apr 11, 2016,4:24:50 PM,beans
 */
package beans;

import java.util.HashMap;

/**
 * @author DnZdP
 *
 */
public class BeanDemo1 {
	public static void main(String[] args) {
		HashMap<String, Empbean> h1 = new HashMap<String, Empbean>();
		
		Empbean e1 = new Empbean();
		e1.setEidno(01);
		e1.setEname("dp01");
		e1.setEsal(1000);
		h1.put("dp01", e1);
		
		Empbean e2 = new Empbean();
		e2.setEidno(02);
		e2.setEname("dp02");
		e2.setEsal(2000);
		h1.put("dp02",e2);
		
		Empbean e = h1.get("dp01");
		int id = e.getEidno();
		String name = e.getEname();
		float sal = e.getEsal();
		System.out.println(id+" "+name+" "+sal);
	}
}