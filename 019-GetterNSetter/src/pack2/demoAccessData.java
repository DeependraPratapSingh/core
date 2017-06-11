package pack2;

import java.util.HashMap;

/**
 * @author DnzDP
 *
 */
public class demoAccessData {
	public static void main(String[] args) {
		demoDAO dd = new demoDAO();
		HashMap<String, demoBean> hm = dd.setData();

		demoBean dm1 = hm.get("DP01");
		int id1 = dm1.getId();
		System.out.println("ID :"+id1);
		int age1 = dm1.getAge();
		System.out.println("Age :"+age1);
		String FName1 = dm1.getFname();
		System.out.println("Fname :"+FName1);
		String LName1 = dm1.getLname();
		System.out.println("Lname :"+LName1);
		
		System.out.println();
		
		demoBean dm2 = hm.get("DP02");
		int id2 = dm2.getId();
		System.out.println("ID :"+id2);
		int age2 = dm2.getAge();
		System.out.println("Age :"+age2);
		String FName2 = dm2.getFname();
		System.out.println("Fname :"+FName2);
		String LName2 = dm2.getLname();
		System.out.println("Lname :"+LName2);
		
		System.out.println();
		
		demoBean dm3 = hm.get("DP03");
		int id3 = dm3.getId();
		System.out.println("ID :"+id3);
		int age3 = dm3.getAge();
		System.out.println("Age :"+age3);
		String FName3 = dm3.getFname();
		System.out.println("Fname :"+FName3);
		String LName3 = dm3.getLname();
		System.out.println("Lname :"+LName3);
	}
}
