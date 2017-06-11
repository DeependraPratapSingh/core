package pack1;
import pack1.EmpBean;

import java.util.HashMap;

/**
 * @author DnzDP
 *=
 */
public class GetEmpBeans 
{
	public static void main(String[] args) {
/*		EmpDAO ed = new EmpDAO();
		HashMap<String, EmpBean> hm = ed.setEmpData();
		EmpBean eb = hm.get("Dp01");
		int id = eb.getEmpId();
		System.out.println("EmpId :: "+id);
		String FName = eb.getFirstName();
		System.out.println("FName :: "+FName);
		String LName = eb.getLastName();
		System.out.println("Lname :: "+LName);
		String city = eb.getCity();
		System.out.println("City :: "+city);
		
		System.out.println();
		
		EmpBean eb1 = hm.get("dp02");
		int id1 = eb1.getEmpId();
		System.out.println("EmpId :: "+id1);
		String FName1 = eb.getFirstName();
		System.out.println("FName :: "+FName1);
		String LName1 = eb.getLastName();
		System.out.println("Lname :: "+LName1);
		String city1 = eb.getCity();
		System.out.println("City :: "+city1);*/
		
		
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