package StringDemo;
public class StringDemo4 {
	public static void main(String[] args) {
		String sql1 = "insert into emp values(100,'john',7000)";
		System.out.println(sql1);
		
		int idno = 101;
		String ename = "Smith";
		float sal = 8000;
		String sql2 = "insert into emp values("+idno+",'"+ename+"',"+sal+")";
		System.out.println(sql2);
	}
}
