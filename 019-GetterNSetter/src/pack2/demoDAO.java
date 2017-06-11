package pack2;

import java.util.HashMap;

/**
 * @author DnzDP
 *
 */
public class demoDAO {
	
	public HashMap<String, demoBean> setData(){
		HashMap<String, demoBean> h1 = new HashMap<String, demoBean>();
		
		demoBean d1 = new demoBean();
		d1.setId(01);
		d1.setAge(21);
		d1.setFname("Deependra01");
		d1.setLname("Singh01");
		h1.put("DP01", d1);
		
		demoBean d2 = new demoBean();
		d2.setId(02);
		d2.setAge(22);
		d2.setFname("Deependra02");
		d2.setLname("Singh02");
		h1.put("DP02", d2);
		
		demoBean d3 = new demoBean();
		d3.setId(03);
		d3.setAge(23);
		d3.setFname("Deependra03");
		d3.setLname("Singh03");
		h1.put("DP03", d3);
		
		return h1;
	}
	public static void main(String[] args) {
		demoDAO dd = new demoDAO();
		HashMap<String, demoBean> hm = dd.setData();
		
		demoBean dm1 = hm.get("DP01");
		int id1 = dm1.getId();
		System.out.println("ID : "+id1);
		int age1 = dm1.getAge();
		System.out.println("Age : "+age1);
		String Fname1 = dm1.getFname();
		System.out.println("Fname : "+Fname1);
		String Lname1 = dm1.getLname();
		System.out.println("Laname : "+Lname1);
	}
}
