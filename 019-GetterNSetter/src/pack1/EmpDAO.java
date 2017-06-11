package pack1;

import java.util.HashMap;

/**
 * @author DnzDP
 *
 */
public class EmpDAO {
	
	public HashMap<String, EmpBean> setEmpData(){
		HashMap<String, EmpBean> h1 = new HashMap<String, EmpBean>();
		
		EmpBean e1 = new EmpBean();
		e1.setEmpId(01);
		e1.setFirstName("Deependra01");
		e1.setLastName("Singh01");
		e1.setCity("Delhi01");
		h1.put("Dp01", e1);
		
		EmpBean e2 = new EmpBean();
		e2.setEmpId(02);
		e2.setFirstName("Deependra02");
		e2.setLastName("Singh02");
		e2.setCity("Delhi02");
		h1.put("dp02", e2);
	
		return h1;
	}
	public static void main(String[] args) {
		EmpDAO Ed = new EmpDAO();
		HashMap<String, EmpBean> hm = Ed.setEmpData();
		
		EmpBean eb1 = hm.get("Dp01");
		int id1 = eb1.getEmpId();
		System.out.println("EId : "+id1);
		String FName1 = eb1.getFirstName();
		System.out.println("FName :: "+FName1);
		String LName1 = eb1.getLastName();
		System.out.println("Lname :: "+LName1);
		String city1 = eb1.getCity();
		System.out.println("City :: "+city1);
		
		System.out.println();
		
		EmpBean eb2 = hm.get("dp02");
		int id2 = eb2.getEmpId();
		System.out.println("EId : "+id2);
		String FName2 = eb2.getFirstName();
		System.out.println("FName :: "+FName2);
		String LName2 = eb2.getLastName();
		System.out.println("Lname :: "+LName2);
		String city2 = eb2.getCity();
		System.out.println("City :: "+city2);
	}
}